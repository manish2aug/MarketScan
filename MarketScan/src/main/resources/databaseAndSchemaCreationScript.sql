-- drop database "bazaarbargain";

create database bazaarbargain
  with owner = postgres
       encoding = 'utf8'
       tablespace = pg_default
       lc_collate = 'english_india.1252'
       lc_ctype = 'english_india.1252'
       connection limit = -1;
       
-- drop schema bazaar_bargain;

create schema bazaar_bargain
  authorization postgres;