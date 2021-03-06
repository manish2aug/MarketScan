-----------------------------------------------------------------------------------------------
-- Insert scripts for test data
-----------------------------------------------------------------------------------------------

-- Reset sequence option
ALTER SEQUENCE market_scan.product_category_id_seq RESTART WITH 1;
----
INSERT INTO market_scan.product_category (name, code) VALUES ('undefined', 'UNDEFINED');
INSERT INTO market_scan.product_category (name, code) VALUES ('electronic items', 'ELECTRONICS');
INSERT INTO market_scan.product_category (name, code) VALUES ('fruits and veg', 'FRESH_PLANTS');
INSERT INTO market_scan.product_category (name, code) VALUES ('grocery items', 'GROCERIES');
INSERT INTO market_scan.product_category (name, code) VALUES ('medical items', 'MEDICAL');
INSERT INTO market_scan.product_category (name, code) VALUES ('household items', 'HOUSEHOLDS');
INSERT INTO market_scan.product_category (name, code) VALUES ('sport items', 'SPORTS');
INSERT INTO market_scan.product_category (name, code) VALUES ('kids world', 'KIDS_WORLD');
INSERT INTO market_scan.product_category (name, code) VALUES ('men world', 'MEN_WORLD');
INSERT INTO market_scan.product_category (name, code) VALUES ('women world', 'WOMEN_WORLD');
INSERT INTO market_scan.product_category (name, code) VALUES ('books', 'BOOKS');
INSERT INTO market_scan.product_category (name, code) VALUES ('services', 'SERVICES');
-----------------------------------------------------------------------------------------------
-- sub categories
--------------------------------------------------------------------------------------------
-- Reset sequence option
ALTER SEQUENCE market_scan.product_subcategory_id_seq RESTART WITH 1;
----
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('undefined', (SELECT id FROM market_scan.product_category WHERE code = 'UNDEFINED'),'UNDEFINED');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('mobile', (SELECT id FROM market_scan.product_category WHERE code = 'ELECTRONICS'), 'MOBILE');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('tablet',  (SELECT id FROM market_scan.product_category WHERE code = 'ELECTRONICS'), 'TABLET');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('mobile\tablet accessories',  (SELECT id FROM market_scan.product_category WHERE code = 'ELECTRONICS'), 'MOB_ACCESSORIES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('laptop',  (SELECT id FROM market_scan.product_category WHERE code = 'ELECTRONICS'), 'LAPTOP');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('desktop',  (SELECT id FROM market_scan.product_category WHERE code = 'ELECTRONICS'), 'DESKTOP');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('all-in-one',  (SELECT id FROM market_scan.product_category WHERE code = 'ELECTRONICS'), 'ALL_IN_ONE_COMP');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('computer accessories',  (SELECT id FROM market_scan.product_category WHERE code = 'ELECTRONICS'), 'COMP_ACCESSORIES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('gaming',  (SELECT id FROM market_scan.product_category WHERE code = 'ELECTRONICS'), 'GAME');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('camera',  (SELECT id FROM market_scan.product_category WHERE code = 'ELECTRONICS'), 'CAMERA');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('tv',  (SELECT id FROM market_scan.product_category WHERE code = 'ELECTRONICS'), 'TV');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('audio video',  (SELECT id FROM market_scan.product_category WHERE code = 'ELECTRONICS'), 'AUDIO_VIDEO');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('security',  (SELECT id FROM market_scan.product_category WHERE code = 'ELECTRONICS'), 'SECURITY');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('software',  (SELECT id FROM market_scan.product_category WHERE code = 'ELECTRONICS'), 'SOFTWARE');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('home appliance',  (SELECT id FROM market_scan.product_category WHERE code = 'ELECTRONICS'), 'HOME_APPL');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('kitchen appliance',  (SELECT id FROM market_scan.product_category WHERE code = 'ELECTRONICS'), 'KITCHEN_APPL');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('garden appliance',  (SELECT id FROM market_scan.product_category WHERE code = 'ELECTRONICS'), 'GARDEN_APPL');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('personal care',  (SELECT id FROM market_scan.product_category WHERE code = 'ELECTRONICS'), 'PERSONAL_CARE');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('decoration',  (SELECT id FROM market_scan.product_category WHERE code = 'ELECTRONICS'), 'DECORATION');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('watches',  (SELECT id FROM market_scan.product_category WHERE code = 'ELECTRONICS'), 'WATCHES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('health care',  (SELECT id FROM market_scan.product_category WHERE code = 'ELECTRONICS'), 'HEALTH_CARE');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('miscellaneous',  (SELECT id FROM market_scan.product_category WHERE code = 'ELECTRONICS'), 'MISC_ELECTRONICS');

INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('vegetables',  (SELECT id FROM market_scan.product_category WHERE code = 'FRESH_PLANTS'), 'VEG');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('fruit',  (SELECT id FROM market_scan.product_category WHERE code = 'FRESH_PLANTS'), 'FRUITS');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('plants',  (SELECT id FROM market_scan.product_category WHERE code = 'FRESH_PLANTS'), 'PLANTS');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('miscellaneous',  (SELECT id FROM market_scan.product_category WHERE code = 'FRESH_PLANTS'), 'MISC_FRESH_PLANTS');

INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('spices', (SELECT id FROM market_scan.product_category WHERE code = 'GROCERIES'), 'SPICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('bakery items', (SELECT id FROM market_scan.product_category WHERE code = 'GROCERIES'), 'BAKERY');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('pulses\lentils', (SELECT id FROM market_scan.product_category WHERE code = 'GROCERIES'), 'PULSES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('beverages', (SELECT id FROM market_scan.product_category WHERE code = 'GROCERIES'), 'BEVERAGES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('baby food', (SELECT id FROM market_scan.product_category WHERE code = 'GROCERIES'), 'BABY_FOOD');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('pet food', (SELECT id FROM market_scan.product_category WHERE code = 'GROCERIES'), 'PET_FOOD');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('cooking oil\ghee', (SELECT id FROM market_scan.product_category WHERE code = 'GROCERIES'), 'OIL_GHEE');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('miscellaneous', (SELECT id FROM market_scan.product_category WHERE code = 'GROCERIES'), 'MISC_GROCERIES');

INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('allopathic medicine', (SELECT id FROM market_scan.product_category WHERE code = 'MEDICAL'), 'ALLPATHIC');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('ayurvedic medicine', (SELECT id FROM market_scan.product_category WHERE code = 'MEDICAL'), 'AYURVEDIC');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('supplement & nutrition', (SELECT id FROM market_scan.product_category WHERE code = 'MEDICAL'), 'NUTRITION');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('equipment', (SELECT id FROM market_scan.product_category WHERE code = 'MEDICAL'), 'EQUIPMENTS');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('miscellaneous', (SELECT id FROM market_scan.product_category WHERE code = 'MEDICAL'), 'MISC_MEDICAL');

INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('kitchen appliances', (SELECT id FROM market_scan.product_category WHERE code = 'HOUSEHOLDS'), 'KITCHEN_HOUSEHOLD');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('kitchen ware', (SELECT id FROM market_scan.product_category WHERE code = 'HOUSEHOLDS'), 'KITCHEN_WARE');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('furniture', (SELECT id FROM market_scan.product_category WHERE code = 'HOUSEHOLDS'), 'FURNITURE');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('home decoration', (SELECT id FROM market_scan.product_category WHERE code = 'HOUSEHOLDS'), 'HOME_DECORATION');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('hardware', (SELECT id FROM market_scan.product_category WHERE code = 'HOUSEHOLDS'),'HARDWARE');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('personal care', (SELECT id FROM market_scan.product_category WHERE code = 'HOUSEHOLDS'), 'DAILY_PERSONAL_CARE');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('stationary', (SELECT id FROM market_scan.product_category WHERE code = 'HOUSEHOLDS'), 'STATIONARY');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('miscellaneous', (SELECT id FROM market_scan.product_category WHERE code = 'HOUSEHOLDS'), 'MISC_HOUSEHOLD');

INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('wearable', (SELECT id FROM market_scan.product_category WHERE code = 'SPORTS'), 'SPORTS_WEAR');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('goods', (SELECT id FROM market_scan.product_category WHERE code = 'SPORTS'), 'SPORTS_GOODS');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('equipment', (SELECT id FROM market_scan.product_category WHERE code = 'SPORTS'), 'SPORTS_EQUIPMENT');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('supplement & nutrition', (SELECT id FROM market_scan.product_category WHERE code = 'SPORTS'), 'SPORT_SUPPLIMENTS');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('bags', (SELECT id FROM market_scan.product_category WHERE code = 'SPORTS'), 'SPORTS_BAGS');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('miscellaneous', (SELECT id FROM market_scan.product_category WHERE code = 'SPORTS'), 'MISC_SPORTS');


INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('infant food', (SELECT id FROM market_scan.product_category WHERE code = 'KIDS_WORLD'), 'FOOD_INFANTS');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('food for kids', (SELECT id FROM market_scan.product_category WHERE code = 'KIDS_WORLD'), 'FOOD_KIDS');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('infant baby boy clothing', (SELECT id FROM market_scan.product_category WHERE code = 'KIDS_WORLD'), 'CLOTHES_INFANT_BOY');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('infant baby girl clothing', (SELECT id FROM market_scan.product_category WHERE code = 'KIDS_WORLD'), 'CLOTHES_INFANT_GIRL');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('boy clothing', (SELECT id FROM market_scan.product_category WHERE code = 'KIDS_WORLD'), 'CLOTHES_BOY');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('girl clothing', (SELECT id FROM market_scan.product_category WHERE code = 'KIDS_WORLD'), 'CLOTHES_GIRL');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('stationary', (SELECT id FROM market_scan.product_category WHERE code = 'KIDS_WORLD'), 'STATIONARY_KIDS');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('boy toys', (SELECT id FROM market_scan.product_category WHERE code = 'KIDS_WORLD'), 'TOYS_BOY');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('girl toys', (SELECT id FROM market_scan.product_category WHERE code = 'KIDS_WORLD'), 'TOYS_GIRL');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('infant toys', (SELECT id FROM market_scan.product_category WHERE code = 'KIDS_WORLD'), 'TOYS_INFANT');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('baby care', (SELECT id FROM market_scan.product_category WHERE code = 'KIDS_WORLD'), 'PERSONAL_CARE_BABY');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('infant boy footwear', (SELECT id FROM market_scan.product_category WHERE code = 'KIDS_WORLD'), 'FOOTWEAR_INFANT_BOY');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('infant girl footwear', (SELECT id FROM market_scan.product_category WHERE code = 'KIDS_WORLD'), 'FOOTWEAR_INFANT_GIRL');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('boy footwear', (SELECT id FROM market_scan.product_category WHERE code = 'KIDS_WORLD'), 'FOOTWEAR_BOY');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('girl footwear', (SELECT id FROM market_scan.product_category WHERE code = 'KIDS_WORLD'), 'FOOTWEAR_GIRL');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('supplement & nutrition', (SELECT id FROM market_scan.product_category WHERE code = 'KIDS_WORLD'), 'NUTRITION_KIDS');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('kids furniture', (SELECT id FROM market_scan.product_category WHERE code = 'KIDS_WORLD'), 'FURNITURE_KIDS');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('infant furniture', (SELECT id FROM market_scan.product_category WHERE code = 'KIDS_WORLD'), 'FURNITURE_INFANT');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('kids room decoration', (SELECT id FROM market_scan.product_category WHERE code = 'KIDS_WORLD'), 'DECORATION_KIDS');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('miscellaneous', (SELECT id FROM market_scan.product_category WHERE code = 'KIDS_WORLD'), 'MISC_KIDS_WORLD');

INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('clothing', (SELECT id FROM market_scan.product_category WHERE code = 'MEN_WORLD'), 'CLOTHES_MEN');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('footwear', (SELECT id FROM market_scan.product_category WHERE code = 'MEN_WORLD'), 'FOOTWEAR_MEN');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('watches', (SELECT id FROM market_scan.product_category WHERE code = 'MEN_WORLD'), 'WATCHES_MEN');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('bags', (SELECT id FROM market_scan.product_category WHERE code = 'MEN_WORLD'), 'BAGS_MEN');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('eye wear', (SELECT id FROM market_scan.product_category WHERE code = 'MEN_WORLD'), 'EYE_WEAR_MEN');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('accessories', (SELECT id FROM market_scan.product_category WHERE code = 'MEN_WORLD'), 'ACCESSORIES_MEN');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('grooming equipments', (SELECT id FROM market_scan.product_category WHERE code = 'MEN_WORLD'), 'GROOMING_MEN');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('personal care', (SELECT id FROM market_scan.product_category WHERE code = 'MEN_WORLD'), 'PERSONAL_CARE_MEN');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('health care', (SELECT id FROM market_scan.product_category WHERE code = 'MEN_WORLD'), 'HEATH_CARE_MEN');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('miscellaneous', (SELECT id FROM market_scan.product_category WHERE code = 'MEN_WORLD'), 'MISC_MEN');

INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('clothing', (SELECT id FROM market_scan.product_category WHERE code = 'WOMEN_WORLD'), 'CLOTHES_WOMEN');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('footwear', (SELECT id FROM market_scan.product_category WHERE code = 'WOMEN_WORLD'), 'FOOTWEAR_WOMEN');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('watches', (SELECT id FROM market_scan.product_category WHERE code = 'WOMEN_WORLD'), 'WATCHES_WOMEN');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('bags', (SELECT id FROM market_scan.product_category WHERE code = 'WOMEN_WORLD'), 'BAGS_WOMEN');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('eye wear', (SELECT id FROM market_scan.product_category WHERE code = 'WOMEN_WORLD'), 'EYE_WEAR_WOMEN');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('accessories', (SELECT id FROM market_scan.product_category WHERE code = 'WOMEN_WORLD'), 'ACCESSORIES_WOMEN');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('grooming equipments', (SELECT id FROM market_scan.product_category WHERE code = 'WOMEN_WORLD'), 'GROOMING_WOMEN');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('personal care', (SELECT id FROM market_scan.product_category WHERE code = 'WOMEN_WORLD'), 'PERSONAL_CARE_WOMEN');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('health care', (SELECT id FROM market_scan.product_category WHERE code = 'WOMEN_WORLD'), 'HEATH_CARE_WOMEN');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('miscellaneous', (SELECT id FROM market_scan.product_category WHERE code = 'WOMEN_WORLD'), 'MISC_WOMEN');

INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('programing', (SELECT id FROM market_scan.product_category WHERE code = 'BOOKS'), 'PROGRAMMING_BOOKS');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('litrature', (SELECT id FROM market_scan.product_category WHERE code = 'BOOKS'), 'LITRATURE_BOOKS');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('acedmic', (SELECT id FROM market_scan.product_category WHERE code = 'BOOKS'), 'ACEDMIC_BOOKS');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('comic', (SELECT id FROM market_scan.product_category WHERE code = 'BOOKS'), 'COMIC_BOOKS');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('recipe', (SELECT id FROM market_scan.product_category WHERE code = 'BOOKS'), 'RECIPE_BOOKS');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('business', (SELECT id FROM market_scan.product_category WHERE code = 'BOOKS'), 'BUSINESS_BOOKS');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('miscellaneous', (SELECT id FROM market_scan.product_category WHERE code = 'BOOKS'), 'MISC_BOOKS');

INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('pest control services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'PEST_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('accounting services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'ACCOUNTING_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('car repair', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'CAR_REPAIR_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('bike repair', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'BIKE_REPAIR_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('tuition services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'TUITION_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('bridal services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'BRIDAL_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('transport services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'TRANSPORT_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('taxi services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'TAXI_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('cleaning services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'CLEANING_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('decorating services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'DECORATION_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('electrical services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'ELECTRICAL_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('event planning services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'EVENT_PLANNING_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('hair salons', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'HAIR_SALOON_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('interior decoration', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'INTERIOR_DECORATION_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('house architecture services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'ARCHITECT_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('lawn and garden services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'GARDEN_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('packers and movers services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'PACKER_MOVER_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('courier services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'COURIER_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('travel agencies', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'TRAVEL_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('painting services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'PAINING_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('pet care services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'PET_CARE_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('real estate services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'REAL_STATE_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('plumbing services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'PLUMBING_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('photography\video services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'PHOTOGRAPHY_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('printing services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'PRINTING_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('computer repair services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'COMPUTER_REPAIR_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('gym\fitness services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'GYM_FITNES_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('security services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'SECURITY_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('construction services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'CONSTRUCTION_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('renovation services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'RENOVATION_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('advertisement services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'ADVERTISEMENT_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('medical services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'MEDICAL_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('mobile repair', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'MOBILE_REPAIR_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('stitching services\boutique', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'STICHING_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('education services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'EDUCATION_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('child care services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'CHILD_CARE_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('dj services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'DJ_SOUND_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('catering services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'CATERING_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('career counselling services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'CAREER_COUNSELLING_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('employment services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'EMPLOYMENT_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('domestic help services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'DOMESTIC_HELP_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('hostel services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'HOSTEL_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('grinding\extraction services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'GRINDING_EXTRACTION_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('wedding services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'WEDDING_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('automation services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'AUTOMATION_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('entertainment services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'ENTERTAINMENT_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('fast food services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'FAST_FOOD_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('legal services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'LEGAL_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('staffing\recruitment', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'STAFFING_RECRUITMENT_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('make-up services', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'MAKEUP_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('religious ritual', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'RELIGIOUS_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('driving school', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'DRIVING_SERVICES');
INSERT INTO market_scan.product_subcategory(name, product_category_id, code) VALUES ('miscellaneous', (SELECT id FROM market_scan.product_category WHERE code = 'SERVICES'), 'MISC_SERVICES');
------------------------------------------------------------------------------------------------------------------
-- Reset sequence option
ALTER SEQUENCE market_scan.state_id_seq RESTART WITH 1;
----
INSERT INTO market_scan.state(name, code) VALUES ('Uttar Pradesh (UP)', 'UP');
--------------------------------------------------------------------------------------------------
-- Reset sequence option
ALTER SEQUENCE market_scan.city_id_seq RESTART WITH 1;
----
INSERT INTO market_scan.city(name, state_id, code) VALUES ('meerut', (SELECT id FROM market_scan.state WHERE code = 'UP'), 'MUT');
---------------------------------------------------------------------------------------------------
-- Reset sequence option
ALTER SEQUENCE market_scan.brand_id_seq RESTART WITH 1;
----
INSERT INTO market_scan.brand(name, code) VALUES ('undefined', 'UNDEFINED');
INSERT INTO market_scan.brand(name, code) VALUES ('ramdev', 'RAMDEV');
INSERT INTO market_scan.brand(name, code) VALUES ('oReilly', 'O_REILLY');
INSERT INTO market_scan.brand(name, code) VALUES ('Vidya Prakashan', 'VIDYA_PRAKASHAN');
INSERT INTO market_scan.brand(name, code) VALUES ('Kedar Nath Ram Nath Edducational Publishers', 'KNRN');

-- Reset sequence option
ALTER SEQUENCE market_scan.unit_id_seq RESTART WITH 1;
----
INSERT INTO market_scan.unit(name, code) VALUES ('Gram', 'gm');
INSERT INTO market_scan.unit(name, code) VALUES ('Item', 'piece');
INSERT INTO market_scan.unit(name, code) VALUES ('Kilogram', 'kg');
INSERT INTO market_scan.unit(name, code) VALUES ('Meter', 'mtr');
INSERT INTO market_scan.unit(name, code) VALUES ('Kilometer', 'km');
INSERT INTO market_scan.unit(name, code) VALUES ('Liter', 'lt');


------------------------------------------------------------------------------------------------
--							ITEM table dataload
------------------------------------------------------------------------------------------------



-- Reset sequence option
ALTER SEQUENCE market_scan.product_id_seq RESTART WITH 1;

-- Grocery data load
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('hing', (SELECT id FROM market_scan.unit WHERE code = 'gm'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'SPICES'), (SELECT id FROM market_scan.brand WHERE code = 'RAMDEV'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));

-- Books
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('C programming', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'PROGRAMMING_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'O_REILLY'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('C++ programming', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'PROGRAMMING_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'O_REILLY'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Java programming', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'PROGRAMMING_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'O_REILLY'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Effective Java', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'PROGRAMMING_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'O_REILLY'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));

INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Airthmatic', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Numerical Analysis', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Organic Chemistry', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Real Theory', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Inorganic Chemistry', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Physical Chemistry', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Mordern Alzebra', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Dynamics', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Nuclear Physics', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Relative Theory', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Quantum Physics', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Statistics', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Calculus', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Trignometry', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Cordinates', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Lenear Programming For B.Sc. Part-III Paper-IV(B)', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Complex Analysis For B.Sc. Part-III Paper-II', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Operations Research Theory, Methods and Applications', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Differential Equations', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Numerical Analysis and Programming in C for B.Sc Part III Paper III', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Real Analysis for B.Sc (T.D.C.) Part III Paper I', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Complex Analysis for B.Sc. Part III, Paper II', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Real Analysis for B.A./B.Sc. ( T.D.C.) Part III, Paper I', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Numerical Analysis and Programimg in C for B.Sc Part III, Paper III', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Linear Programming for B.Sc. Part III, Paper IV (b)', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Linear Algebra And Matrices', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Mechanics for B.A./B.Sc. (Part II Paper III)', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Mechanics', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Differential Equations And integral Transforms', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Linear Algebra And Matrices', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Differential Equations And integral Transforms', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Optimization Technique in Engineering', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Operations Research for Engineering and Technology (U.P.T.U)', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Operations Research (JNTU)', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Operations Research (Visvesvaraya Technological University, Belgaum (Karnataka) For B.Tech VIth Semester', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Operations Research (Visvesvaraya Technological University, Belgaum (Karnataka) For B.Tech VIIth Semester', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Mathematical Statistics', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Co-Ordinate Solid Geometry', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Differential Geometry', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Spherical Astronomy', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Attraction and Potential', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Hydro - Statics', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Functions of a Complex Variable', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Dynamics of Rigid Bodies', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Elementary Hydro Dynamics', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Geometry And Vector Analysis For B.A./B.Sc. (T.D.C.) Part- I Paper-III', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Calculus', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Algebra And Trignometry', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Topology', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Complex Analysis', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('Applied Statistics', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('A Text Book of Geometry & Vector Calculus', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('A Text Book of Calculus', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));
INSERT INTO market_scan.product(name, unit_id, product_subcategory_id, brand_id, city_id) VALUES ('A Text Book of Algebra & Trignometry', (SELECT id FROM market_scan.unit WHERE code = 'piece'), (SELECT id FROM market_scan.product_subcategory WHERE code = 'ACEDMIC_BOOKS'), (SELECT id FROM market_scan.brand WHERE code = 'KNRN'), (SELECT id FROM market_scan.city WHERE code = 'MUT'));

------------------------------------------------------------------------------------------------------------------

-- role table
-- Reset sequence option
ALTER SEQUENCE market_scan.role_id_seq RESTART WITH 1;
----
INSERT INTO market_scan.role(name, code) VALUES ('Seller', 'S');
INSERT INTO market_scan.role(name, code) VALUES ('Buyer', 'B');
INSERT INTO market_scan.role(name, code) VALUES ('Admin', 'A');
INSERT INTO market_scan.role(name, code) VALUES ('Owner', 'O');

-- Reset sequence option
ALTER SEQUENCE market_scan.deal_package_id_seq RESTART WITH 1;
INSERT INTO market_scan.deal_package(name, code, deal_count, package_validity, deal_validity) VALUES ('undefined', 'UNDEFINED', 0, 0, 0);


-- user table
-- Reset sequence option
ALTER SEQUENCE market_scan.person_id_seq RESTART WITH 1;
----
INSERT INTO market_scan.person(full_name, user_name, password, uuid, mac_address, ip_address, device_id, mobile_no, landline_no, whatsapp_no, email_address, shop_name, physical_address_line1, physical_address_line2, landmark, sub_locality, locality, town, pin_code, longitude, lattitude, last_login_date, last_activity, is_delivery_available, registration_date, role_id, city_id, deal_account_id) 
values ('Deepak Chaurisiya', '', '', '', 'D0-53-49-55-20-E3', '192.168.1.1', 'm00123456', '9999048156', '01212556599', '9999048156', 'deepak0123@gmail.com', 'Deepak Book Store', '201 shivlok puri', 'kanker khera', 'krishna public school', 'old cant', 'cantt', 'kanker khera', '250001', 28.9837071, 77.7060542, '2016-06-01', 'Searched: Nuclear physics', false, '2015-05-05', (SELECT ID FROM market_scan.role where code = 'S'), (SELECT ID FROM market_scan.city where code = 'MUT'), null);
INSERT INTO market_scan.person(full_name, user_name, password, uuid, mac_address, ip_address, device_id, mobile_no, landline_no, whatsapp_no, email_address, shop_name, physical_address_line1, physical_address_line2, landmark, sub_locality, locality, town, pin_code, longitude, lattitude, last_login_date, last_activity, is_delivery_available, registration_date, role_id, city_id, deal_account_id) 
values ('Amit Tomer', '', '', '', 'D0-53-49-55-20-E4', '192.168.1.2', 'm00123457', '9999048157', '01212556590', '9999048157', 'amit0123@gmail.com', 'Amit Book Store', '202 shivlok puri', 'kanker khera1', 'krishna public school1', 'old cant', 'cantt', 'kanker khera1', '250001', 28.9837171, 77.7060342, '2016-06-02', 'Searched: Quantum physics', false, '2015-05-06', (SELECT ID FROM market_scan.role where code = 'S'), (SELECT ID FROM market_scan.city where code = 'MUT'), null);
INSERT INTO market_scan.person(full_name, user_name, password, uuid, mac_address, ip_address, device_id, mobile_no, landline_no, whatsapp_no, email_address, shop_name, physical_address_line1, physical_address_line2, landmark, sub_locality, locality, town, pin_code, longitude, lattitude, last_login_date, last_activity, is_delivery_available, registration_date, role_id, city_id, deal_account_id) 
values ('Sunil Baliyan', '', '', '', 'D0-53-49-55-20-E5', '192.168.1.3', 'm00123458', '9999048158', '01212556591', '9999048158', 'sunil0123@gmail.com', 'Sunil Book Store', '203 shivlok puri', 'kanker khera2', 'krishna public school2', 'new cant', 'cantt', 'kanker khera2', '250001', 28.9837171, 77.7060562, '2016-06-03', 'Searched: Organic chemistry', true, '2015-05-07', (SELECT ID FROM market_scan.role where code = 'S'), (SELECT ID FROM market_scan.city where code = 'MUT'), null);
INSERT INTO market_scan.person(full_name, user_name, password, uuid, mac_address, ip_address, device_id, mobile_no, landline_no, whatsapp_no, email_address, shop_name, physical_address_line1, physical_address_line2, landmark, sub_locality, locality, town, pin_code, longitude, lattitude, last_login_date, last_activity, is_delivery_available, registration_date, role_id, city_id, deal_account_id) 
values ('Amit Singh', '', '', '', 'D0-53-49-55-20-E6', '192.168.1.4', 'm00123459', '9999048159', '01212556592', '9999048159', 'amits0123@gmail.com', 'AmitS Book Store', '204 shivlok puri', 'kanker khera3', 'krishna public school3', 'old cant', 'cantt', 'kanker khera3', '250001', 28.9838071, 77.7060442, '2016-06-04', 'Searched: Inorganic chemistry', false, '2015-05-08', (SELECT ID FROM market_scan.role where code = 'S'), (SELECT ID FROM market_scan.city where code = 'MUT'), null);
INSERT INTO market_scan.person(full_name, user_name, password, uuid, mac_address, ip_address, device_id, mobile_no, landline_no, whatsapp_no, email_address, shop_name, physical_address_line1, physical_address_line2, landmark, sub_locality, locality, town, pin_code, longitude, lattitude, last_login_date, last_activity, is_delivery_available, registration_date, role_id, city_id, deal_account_id) 
values ('Vimal Kumar', '', '', '', 'D0-53-49-55-20-E7', '192.168.1.5', 'm00123450', '9999048150', '01212556593', '9999048150', 'vimal0123@gmail.com', 'Vimal Book Store', '205 shivlok puri', 'kanker khera4', 'krishna public school4', 'new cant', 'cantt', 'kanker khera4', '250001', 28.9837041, 77.7060342, '2016-06-05', 'Searched: Numerical analysis', true, '2015-05-09', (SELECT ID FROM market_scan.role where code = 'S'), (SELECT ID FROM market_scan.city where code = 'MUT'), null);

ALTER SEQUENCE market_scan.offers_id_seq RESTART WITH 1;
----
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 2, 201, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 2, 191, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 2, 191, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 2, 181, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 2, 203, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 3, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 3, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 3, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 3, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 3, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 4, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 4, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 4, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 4, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 4, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 5, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 5, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 5, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 5, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 5, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 6, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 6, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 6, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 6, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 6, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 7, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 7, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 7, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 7, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 7, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 8, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 8, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 8, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 8, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 8, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 9, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 9, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 9, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 9, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 9, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 10, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 10, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 10, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 10, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 10, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 11, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 11, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 11, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 11, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 11, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 12, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 12, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 12, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 12, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 12, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 13, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 13, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 13, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 13, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 13, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 14, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 14, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 14, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 14, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 14, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 15, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 15, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 15, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 15, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 15, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 16, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 16, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 16, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 16, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 16, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 17, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 17, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 17, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 17, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 17, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 18, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 18, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 18, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 18, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 18, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 19, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 19, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 19, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 19, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 19, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 20, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 20, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 20, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 20, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 20, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 21, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 21, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 21, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 21, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 21, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 22, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 22, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 22, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 22, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 22, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 23, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 23, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 23, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 23, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 23, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 24, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 24, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 24, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 24, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 24, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 25, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 25, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 25, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 25, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 25, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 26, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 26, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 26, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 26, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 26, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 27, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 27, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 27, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 27, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 27, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 28, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 28, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 28, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 28, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 28, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 29, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 29, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 29, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 29, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 29, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 30, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 30, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 30, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 30, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 30, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 31, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 31, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 31, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 31, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 31, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 32, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 32, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 32, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 32, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 32, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 33, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 33, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 33, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 33, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 33, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 34, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 34, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 34, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 34, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 34, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 35, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 35, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 35, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 35, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 35, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 36, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 36, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 36, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 36, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 36, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 37, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 37, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 37, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 37, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 37, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 38, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 38, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 38, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 38, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 38, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 39, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 39, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 39, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 39, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 39, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 40, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 40, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 40, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 40, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 40, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 41, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 41, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 41, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 41, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 41, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 42, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 42, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 42, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 42, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 42, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 43, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 43, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 43, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 43, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 43, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 44, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 44, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 44, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 44, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 44, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 45, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 45, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 45, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 45, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 45, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 46, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 46, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 46, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 46, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 46, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 47, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 47, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 47, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 47, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 47, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 48, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 48, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 48, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 48, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 48, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 49, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 49, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 49, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 49, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 49, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 50, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 50, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 50, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 50, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 50, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 51, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 51, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 51, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 51, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 51, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 52, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 52, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 52, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 52, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 52, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 53, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 53, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 53, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 53, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 53, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 54, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 54, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 54, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 54, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 54, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 55, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 55, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 55, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 55, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 55, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 56, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 56, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 56, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 56, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 56, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 57, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 57, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 57, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 57, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 57, 201, false, '2016-06-15');

INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (1, 58, 200, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (2, 58, 199, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (3, 58, 198, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (4, 58, 189, false, '2016-06-15');
INSERT INTO market_scan.offers(seller_id, product_id, price, is_deal, published_date) VALUES (5, 58, 201, false, '2016-06-15');


ALTER SEQUENCE market_scan.seller_review_id_seq RESTART WITH 1;
----
INSERT INTO market_scan.seller_review(respectful, was_quality_ok, was_quantity_ok, is_recommended,overall_rating, review_comment, seller_id, reviewer_id) VALUES (true, true, true, true, 3, 'Found ok, not so exciting deals though', 1, 2);
INSERT INTO market_scan.seller_review(respectful, was_quality_ok, was_quantity_ok, is_recommended,overall_rating, review_comment, seller_id, reviewer_id) VALUES (true, false, true, true, 3, 'Deal was exciting but product quality was compromised', 2, 1);
INSERT INTO market_scan.seller_review(respectful, was_quality_ok, was_quantity_ok, is_recommended,overall_rating, review_comment, seller_id, reviewer_id) VALUES (true, true, false, true, 3, 'He is chater, deal was just an illusion, I only got 4 instead of 5, went again to complain', 3, 1);
INSERT INTO market_scan.seller_review(respectful, was_quality_ok, was_quantity_ok, is_recommended,overall_rating, review_comment, seller_id, reviewer_id) VALUES (true, true, true, false, 3, 'I cannot recommend this seller as he is in very remote location though deal was ok', 4, 3);
INSERT INTO market_scan.seller_review(respectful, was_quality_ok, was_quantity_ok, is_recommended,overall_rating, review_comment, seller_id, reviewer_id) VALUES (false, true, true, true, 3, 'Deal was good, product was good too, but the seller was very rude, wont be going again for anything', 5, 4);

INSERT INTO market_scan.seller_review(respectful, was_quality_ok, was_quantity_ok, is_recommended,overall_rating, review_comment, seller_id, reviewer_id) VALUES (true, true, true, true, 5, 'Exciting deals, guy was respectful and very friendly', 3, 4);
INSERT INTO market_scan.seller_review(respectful, was_quality_ok, was_quantity_ok, is_recommended,overall_rating, review_comment, seller_id, reviewer_id) VALUES (true, false, true, true, 3, 'Product quality was just ok', 5, 1);
INSERT INTO market_scan.seller_review(respectful, was_quality_ok, was_quantity_ok, is_recommended,overall_rating, review_comment, seller_id, reviewer_id) VALUES (true, true, false, true, 2, 'I doubted about the quantity, and at shop they denied and mentioned adverised deal is incorrect, I think it was just to bring people to their shop', 5, 3);
INSERT INTO market_scan.seller_review(respectful, was_quality_ok, was_quantity_ok, is_recommended,overall_rating, review_comment, seller_id, reviewer_id) VALUES (true, true, true, false, 1, 'Not recommended, shop is just a mess, I had to wait for 1 hour for just one book', 4, 2);
INSERT INTO market_scan.seller_review(respectful, was_quality_ok, was_quantity_ok, is_recommended,overall_rating, review_comment, seller_id, reviewer_id) VALUES (false, true, true, true, 2, 'Stupid person', 2, 5);
