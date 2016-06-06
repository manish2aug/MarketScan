create table bazaar_bargain.deal_history (
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

create table bazaar_bargain.brand (
	id serial primary key not null,
	name_english varchar(100) not null,
	name_hindi varchar(100) not null
);

create table bazaar_bargain.deal_package (
	id smallserial primary key not null,
	name varchar(50) not null,
	package_code char(10) not null,
	total_deals integer, 
	package_validity integer, 
	deal_validity integer
);

create table bazaar_bargain.state (
	id serial primary key not null,
	name_english varchar(100) not null,
	name_hindi varchar(100) not null
);

create table bazaar_bargain.city (
	id serial primary key not null,
	name_english varchar(100) not null,
	name_hindi varchar(100) not null,
	state serial not null references bazaar_bargain.state(id) 
);

create table bazaar_bargain.contact_detail (
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
	city serial not null references bazaar_bargain.city(id),
	longitude varchar(1000) not null,
	lattitude varchar(100) not null
);

create table bazaar_bargain.category (
	id serial primary key not null,
	name_english varchar(100) not null,
	name_hindi varchar(100) not null
);

create table bazaar_bargain.subcategory (
	id serial primary key not null,
	name_english varchar(100) not null,
	name_hindi varchar(100) not null,
	category serial not null references bazaar_bargain.category(id)
);

create table bazaar_bargain.item (
	id bigserial primary key not null,
	name_english varchar(100) not null,
	name_hindi varchar(100) not null,
	unit varchar(50) not null,
	subcategory integer not null references bazaar_bargain.subcategory(id),
	brand integer not null references bazaar_bargain.brand(id)
);

create table bazaar_bargain.user (
	id bigserial primary key not null,
	name_english varchar(100) not null,
	name_hindi varchar(100) not null,
	nick_name varchar(50) null,
	is_active boolean not null,
	is_seller boolean not null,
	is_delivery_available boolean null,
	universally_unique_identifiers varchar(100) null,
	device_id varchar(50) null,
	mac_address macaddr null,
	ip_address inet null,
	registration_date date not null,
	contact_detail bigserial not null references bazaar_bargain.contact_detail(id) 
);

create table bazaar_bargain.review (
	id bigserial primary key not null,
	seller bigserial not null references bazaar_bargain.user(id),
	reviewer bigserial not null references bazaar_bargain.user(id),
	is_recommended boolean not null default true,
	comment varchar(500) null
);

create table bazaar_bargain.deal (
	id serial primary key not null,
	item bigserial not null references bazaar_bargain.item(id),
	seller bigserial not null references bazaar_bargain.user(id),
	deal_published_date date not null,
	deal_expiry_date date not null,
	brand serial not null references bazaar_bargain.brand(id),
	normal_price decimal(12,2) not null,
	deal_price decimal(12,2) not null,
	item_expiry date null
);

create table bazaar_bargain.user_deal_account (
	id serial primary key not null,
	deal_package smallserial not null references bazaar_bargain.deal_package(id),
	purchase_date date not null,
	available_deal_balance smallint not null,
	user_id bigserial not null references bazaar_bargain.user(id) 
);

create table bazaar_bargain.search_history (
	id bigserial primary key not null,
	user_id bigserial not null references bazaar_bargain.user(id),
	item_searched bigserial not null references bazaar_bargain.item(id),
	item_opened boolean not null,
	search_date timestamp not null
);




	
    
