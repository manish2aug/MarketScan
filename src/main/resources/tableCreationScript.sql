
-----------------------------------------------------------------------------------------------------------------------------------------------------------
--------------- DROP TABLES
--drop table market_scan.deal_history;
--drop table market_scan.search_history;
--drop table market_scan.user_deal_account;
--drop table market_scan.deal;
--drop table market_scan.review;
--drop table market_scan.user;
--drop table market_scan.role;
--drop table market_scan.item;
--drop table market_scan.subcategory;
--drop table market_scan.category;
--drop table market_scan.contact_detail;
--drop table market_scan.city;
--drop table market_scan.state;
--drop table market_scan.deal_package;
--drop table market_scan.brand;

-----------------------------------------------------------------------------------------------------------------------------------------------------------

create table market_scan.deal_history (
	id bigserial primary key not null,
	item_name varchar(200) not null, 
	brand varchar(100) not null,
	seller_short_description varchar(200) not null,
	deal_expired_on date not null,
	deal_search_count integer not null,
	deal_viewed_count integer not null,
	normal_price decimal(12,2) not null,
	deal_price decimal(12,2) not null,
	item_expiry date null
);

create table market_scan.brand (
	id serial primary key not null,
	name_english varchar(100) not null,
	name_hindi varchar(100) not null,
	code varchar(50) not null UNIQUE
);

create table market_scan.deal_package (
	id smallserial primary key not null,
	name varchar(50) not null,
	package_code char(10) not null,
	total_deals integer, 
	package_validity integer, 
	deal_validity integer
);

create table market_scan.state (
	id serial primary key not null,
	name_english varchar(100) not null,
	name_hindi varchar(100) not null,
	code varchar(50) not null UNIQUE
);

create table market_scan.city (
	id serial primary key not null,
	name_english varchar(100) not null,
	name_hindi varchar(100) not null,
	state serial not null references market_scan.state(id),
	code varchar(50) not null UNIQUE
);

create table market_scan.contact_detail (
	id bigserial primary key not null,
	shop_name_english varchar(100) null,
	shop_name_hindi varchar(100) null,
	mobile varchar(10) null,
	landline varchar(20) null,
	whatsapp varchar(10) null,
	email varchar(150) not null,
	address_line1 varchar(150) not null,
	addressline2 varchar(150) not null,
	landmark varchar(150) null,
	town_or_locality varchar(100) null,
	city serial not null references market_scan.city(id),
	longitude varchar(1000) not null,
	lattitude varchar(100) not null
);

create table market_scan.category (
	id serial primary key not null,
	name_english varchar(100) not null,
	name_hindi varchar(100) not null,
	code varchar(50) not null UNIQUE
);

create table market_scan.subcategory (
	id serial primary key not null,
	name_english varchar(100) not null,
	name_hindi varchar(100) not null,
	category serial not null references market_scan.category(id),
	code varchar(50) not null UNIQUE
);

create table market_scan.item (
	id bigserial primary key not null,
	name_english varchar(100) not null,
	name_hindi varchar(100) not null,
	unit varchar(50) not null,
	subcategory integer not null references market_scan.subcategory(id),
	brand integer not null references market_scan.brand(id)
);

CREATE TABLE market_scan.role (
  id serial primary key not null,
  name character varying(100) NOT NULL,
  code varchar(50) not null UNIQUE
);

create table market_scan.user (
	id bigserial primary key not null,
	name_english varchar(100) not null,
	name_hindi varchar(100) not null,
	nick_name varchar(50) null,
	is_active boolean not null,
	role integer not null references market_scan.role(id),
	is_delivery_available boolean null,
	universally_unique_identifiers varchar(100) null,
	device_id varchar(50) null,
	mac_address macaddr null,
	ip_address inet null,
	registration_date date DEFAULT now(),
	contact_detail bigint not null references market_scan.contact_detail(id) 
);

create table market_scan.review (
	id bigserial primary key not null,
	seller bigserial not null references market_scan.user(id),
	reviewer bigserial not null references market_scan.user(id),
	is_recommended boolean not null default true,
	comment varchar(500) null
);

create table market_scan.deal (
	id serial primary key not null,
	item bigserial not null references market_scan.item(id),
	seller bigserial not null references market_scan.user(id),
	deal_published_date date not null,
	deal_expiry_date date not null,
	brand serial not null references market_scan.brand(id),
	normal_price decimal(12,2) not null,
	deal_price decimal(12,2) not null,
	item_expiry date null
);

create table market_scan.user_deal_account (
	id serial primary key not null,
	deal_package smallserial not null references market_scan.deal_package(id),
	purchase_date date not null,
	available_deal_balance smallint not null,
	user_id bigserial not null references market_scan.user(id) 
);

create table market_scan.search_history (
	id bigserial primary key not null,
	user_id bigserial not null references market_scan.user(id),
	item_searched bigserial not null references market_scan.item(id),
	item_opened boolean not null,
	search_date timestamp not null
);





	
    
