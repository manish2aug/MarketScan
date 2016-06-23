
-----------------------------------------------------------------------------------------------------------------------------------------------------------
--------------- DROP TABLES
DROP TABLE MARKET_SCAN.SEARCH_HISTORY;
DROP TABLE MARKET_SCAN.DEAL_HISTORY;
DROP TABLE MARKET_SCAN.OFFERS;
DROP TABLE MARKET_SCAN.SELLER_REVIEW;
DROP TABLE MARKET_SCAN.PERSON;
DROP TABLE MARKET_SCAN.ROLE;
DROP TABLE MARKET_SCAN.DEAL_ACCOUNT;
DROP TABLE MARKET_SCAN.DEAL_PACKAGE;
DROP TABLE MARKET_SCAN.PRODUCT;
DROP TABLE MARKET_SCAN.PRODUCT_SUBCATEGORY;
DROP TABLE MARKET_SCAN.PRODUCT_CATEGORY;
DROP TABLE MARKET_SCAN.BRAND;
DROP TABLE MARKET_SCAN.CITY;
DROP TABLE MARKET_SCAN.STATE;
DROP TABLE MARKET_SCAN.UNIT;

-----------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE TABLE MARKET_SCAN.STATE (
	ID SMALLSERIAL PRIMARY KEY NOT NULL,
	NAME VARCHAR(100) NOT NULL,
	CODE VARCHAR(30) NOT NULL UNIQUE
);

CREATE TABLE MARKET_SCAN.CITY (
	ID SMALLSERIAL PRIMARY KEY NOT NULL,
	NAME VARCHAR(100) NOT NULL,
	STATE_ID SMALLINT NOT NULL REFERENCES MARKET_SCAN.STATE(ID),
	CODE VARCHAR(30) NOT NULL UNIQUE
);

CREATE TABLE MARKET_SCAN.BRAND (
	ID SERIAL PRIMARY KEY NOT NULL,
	NAME VARCHAR(100) NOT NULL,
	CODE VARCHAR(30) NOT NULL UNIQUE
);

CREATE TABLE MARKET_SCAN.UNIT (
	ID SMALLSERIAL PRIMARY KEY NOT NULL,
	NAME VARCHAR(50) NOT NULL,
	CODE VARCHAR(10) NOT NULL UNIQUE
);

CREATE TABLE MARKET_SCAN.PRODUCT_CATEGORY (
	ID SMALLSERIAL PRIMARY KEY NOT NULL,
	NAME VARCHAR(100) NOT NULL,
	CODE VARCHAR(30) NOT NULL UNIQUE
);

CREATE TABLE MARKET_SCAN.PRODUCT_SUBCATEGORY (
	ID SERIAL PRIMARY KEY NOT NULL,
	NAME VARCHAR(100) NOT NULL,
	PRODUCT_CATEGORY_ID SMALLINT NOT NULL REFERENCES MARKET_SCAN.PRODUCT_CATEGORY(ID),
	CODE VARCHAR(30) NOT NULL UNIQUE
);

CREATE TABLE MARKET_SCAN.PRODUCT (
	ID SERIAL PRIMARY KEY NOT NULL,
	NAME VARCHAR(150) NOT NULL,
	UNIT_ID SMALLINT NOT NULL REFERENCES MARKET_SCAN.UNIT(ID),
	PRODUCT_SUBCATEGORY_ID INTEGER NOT NULL REFERENCES MARKET_SCAN.PRODUCT_SUBCATEGORY(ID),
	BRAND_ID INTEGER NOT NULL REFERENCES MARKET_SCAN.BRAND(ID),
	CITY_ID SMALLINT NOT NULL REFERENCES MARKET_SCAN.CITY(ID)
);

CREATE TABLE MARKET_SCAN.DEAL_PACKAGE (
	ID SMALLSERIAL PRIMARY KEY NOT NULL,
	NAME VARCHAR(50) NOT NULL,
	CODE CHAR(10) NOT NULL,
	DEAL_COUNT INTEGER NOT NULL, 
	PACKAGE_VALIDITY INTEGER NOT NULL, 
	DEAL_VALIDITY INTEGER NOT NULL
);

CREATE TABLE MARKET_SCAN.DEAL_ACCOUNT (
	ID SERIAL PRIMARY KEY NOT NULL,
	DEAL_PACKAGE_ID SMALLINT NOT NULL REFERENCES MARKET_SCAN.DEAL_PACKAGE(ID),
	PURCHASE_DATE DATE NOT NULL,
	AVAILABLE_DEAL_BALANCE SMALLINT NOT NULL
);

CREATE TABLE MARKET_SCAN.ROLE (
  ID SMALLINT PRIMARY KEY NOT NULL,
  NAME CHARACTER VARYING(10) NOT NULL,
  CODE CHAR(1) NOT NULL UNIQUE
);

CREATE TABLE MARKET_SCAN.PERSON (
	ID SERIAL PRIMARY KEY NOT NULL,
	FULL_NAME VARCHAR(100) NOT NULL,
	USER_NAME VARCHAR(20) NULL,
	PASSWORD VARCHAR(20) NULL,
  	UUID VARCHAR(50) NULL,
  	MAC_ADDRESS MACADDR NULL,
	IP_ADDRESS INET NULL,
	DEVICE_ID VARCHAR(50) NULL,
	SHOP_NAME VARCHAR(100) NULL,
	MOBILE_NO VARCHAR(10) NULL,
	LANDLINE_NO VARCHAR(20) NULL,
	WHATSAPP_NO VARCHAR(10) NULL,
	EMAIL_ADDRESS VARCHAR(150) NOT NULL,
	PHYSICAL_ADDRESS_LINE1 VARCHAR(150) NOT NULL,
	PHYSICAL_ADDRESS_LINE2 VARCHAR(150) NOT NULL,
	LANDMARK VARCHAR(150) NULL,
	TOWN VARCHAR(100) NULL,
	LOCALITY VARCHAR(100) NULL,
	LONGITUDE VARCHAR(100) NOT NULL,
	LATTITUDE VARCHAR(100) NOT NULL,   
	LAST_LOGIN_DATE DATE NULL,
	LAST_ACTIVITY VARCHAR(100) NULL,
	IS_DELIVERY_AVAILABLE BOOLEAN NULL,
	REGISTRATION_DATE DATE DEFAULT NOW(),
	ROLE_ID SMALLINT NOT NULL REFERENCES MARKET_SCAN.ROLE(ID),
	CITY_ID SMALLINT NOT NULL REFERENCES MARKET_SCAN.CITY(ID),
	DEAL_ACCOUNT_ID INTEGER NULL REFERENCES MARKET_SCAN.DEAL_ACCOUNT(ID)
);

CREATE TABLE MARKET_SCAN.SELLER_REVIEW (
	ID SERIAL PRIMARY KEY NOT NULL,
	RESPECTFUL BOOLEAN NOT NULL,
	WAS_QUALITY_OK BOOLEAN NOT NULL,
	WAS_QUANTITY_OK BOOLEAN NOT NULL,
	IS_RECOMMENDED BOOLEAN NOT NULL DEFAULT TRUE,
	OVERALL_RATING SMALLINT NOT NULL,
	COMMENT VARCHAR(500) NULL,
	SELLER_ID INTEGER NOT NULL REFERENCES MARKET_SCAN.PERSON(ID),
	REVIEWER_ID INTEGER NOT NULL REFERENCES MARKET_SCAN.PERSON(ID)
);

-- A JOB WOULD REMOVE ITEMS FROM THIS TABLE ON A REGULAR PERIOD SUBJECT TO DEAL LIFE SPAN, 
-- WHEN A DEAL WILL BE REMOVED IT WILL BE LOGGED FOR AUDIT
CREATE TABLE MARKET_SCAN.OFFERS (
	ID SERIAL PRIMARY KEY NOT NULL,
	SELLER_ID INTEGER NOT NULL REFERENCES MARKET_SCAN.PERSON(ID),
	PRODUCT_ID INTEGER NOT NULL REFERENCES MARKET_SCAN.PRODUCT(ID),
	PRICE DECIMAL(12,2) NOT NULL,
	IS_DEAL BOOLEAN NOT NULL DEFAULT FALSE,
	PUBLISHED_DATE DATE NOT NULL,
	UNIQUE(SELLER_ID, PRODUCT_ID)
);

CREATE TABLE MARKET_SCAN.DEAL_HISTORY (
	ID SERIAL PRIMARY KEY NOT NULL,
	SELLER_ID INTEGER NOT NULL REFERENCES MARKET_SCAN.PERSON(ID),
	PRODUCT_ID INTEGER NOT NULL REFERENCES MARKET_SCAN.PRODUCT(ID),
	DEAL_PUBLISHED DATE NOT NULL,
	DEAL_REMOVED DATE NOT NULL,
	DEAL_VIEWED_COUNT INTEGER NOT NULL,
	LOWEST_PRICE MONEY NOT NULL,
	DEAL_PRICE MONEY NOT NULL
);


CREATE TABLE MARKET_SCAN.SEARCH_HISTORY (
	ID SERIAL PRIMARY KEY NOT NULL,
	PERSON_ID INTEGER NOT NULL REFERENCES MARKET_SCAN.PERSON(ID),
	PRODUCT_ID INTEGER NOT NULL REFERENCES MARKET_SCAN.PRODUCT(ID),
	ITEM_OPENED BOOLEAN NOT NULL,
	SEARCH_DATE TIMESTAMP NOT NULL
);