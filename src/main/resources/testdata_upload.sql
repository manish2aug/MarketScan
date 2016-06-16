
-- Reset sequence option
ALTER SEQUENCE market_scan.category_id_seq RESTART WITH 1;
----
INSERT INTO market_scan.category (name_english, name_hindi, code) VALUES ('undefined', 'undefined', 'UNDEFINED');
INSERT INTO market_scan.category (name_english, name_hindi, code) VALUES ('electronic items', '', 'ELECTRONICS');
INSERT INTO market_scan.category (name_english, name_hindi, code) VALUES ('fruits and veg', '', 'FRESH_PLANTS');
INSERT INTO market_scan.category (name_english, name_hindi, code) VALUES ('grocery items', '', 'GROCERIES');
INSERT INTO market_scan.category (name_english, name_hindi, code) VALUES ('medical items', '', 'MEDICAL');
INSERT INTO market_scan.category (name_english, name_hindi, code) VALUES ('household items', '', 'HOUSEHOLDS');
INSERT INTO market_scan.category (name_english, name_hindi, code) VALUES ('sport items', '', 'SPORTS');
INSERT INTO market_scan.category (name_english, name_hindi, code) VALUES ('kids world', '', 'KIDS_WORLD');
INSERT INTO market_scan.category (name_english, name_hindi, code) VALUES ('men world', '', 'MEN_WORLD');
INSERT INTO market_scan.category (name_english, name_hindi, code) VALUES ('women world', '', 'WOMEN_WORLD');
INSERT INTO market_scan.category (name_english, name_hindi, code) VALUES ('books', '', 'BOOKS');
INSERT INTO market_scan.category (name_english, name_hindi, code) VALUES ('services', '', 'SERVICES');
-----------------------------------------------------------------------------------------------
-- sub categories
--------------------------------------------------------------------------------------------
-- Reset sequence option
ALTER SEQUENCE market_scan.category_id_seq RESTART WITH 1;
----
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('undefined', '', (SELECT id FROM market_scan.category WHERE code = 'UNDEFINED'),'UNDEFINED');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('mobile', '', (SELECT id FROM market_scan.category WHERE code = 'ELECTRONICS'), 'MOBILE');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('tablet', '',  (SELECT id FROM market_scan.category WHERE code = 'ELECTRONICS'), 'TABLET');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('mobile\tablet accessories', '',  (SELECT id FROM market_scan.category WHERE code = 'ELECTRONICS'), 'MOB_ACCESSORIES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('laptop', '',  (SELECT id FROM market_scan.category WHERE code = 'ELECTRONICS'), 'LAPTOP');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('desktop', '',  (SELECT id FROM market_scan.category WHERE code = 'ELECTRONICS'), 'DESKTOP');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('all-in-one', '',  (SELECT id FROM market_scan.category WHERE code = 'ELECTRONICS'), 'ALL_IN_ONE_COMP');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('computer accessories', '',  (SELECT id FROM market_scan.category WHERE code = 'ELECTRONICS'), 'COMP_ACCESSORIES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('gaming', '',  (SELECT id FROM market_scan.category WHERE code = 'ELECTRONICS'), 'GAME');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('camera', '',  (SELECT id FROM market_scan.category WHERE code = 'ELECTRONICS'), 'CAMERA');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('tv', '',  (SELECT id FROM market_scan.category WHERE code = 'ELECTRONICS'), 'TV');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('audio video', '',  (SELECT id FROM market_scan.category WHERE code = 'ELECTRONICS'), 'AUDIO_VIDEO');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('security', '',  (SELECT id FROM market_scan.category WHERE code = 'ELECTRONICS'), 'SECURITY');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('software', '',  (SELECT id FROM market_scan.category WHERE code = 'ELECTRONICS'), 'SOFTWARE');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('home appliance', '',  (SELECT id FROM market_scan.category WHERE code = 'ELECTRONICS'), 'HOME_APPL');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('kitchen appliance', '',  (SELECT id FROM market_scan.category WHERE code = 'ELECTRONICS'), 'KITCHEN_APPL');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('garden appliance', '',  (SELECT id FROM market_scan.category WHERE code = 'ELECTRONICS'), 'GARDEN_APPL');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('personal care', '',  (SELECT id FROM market_scan.category WHERE code = 'ELECTRONICS'), 'PERSONAL_CARE');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('decoration', '',  (SELECT id FROM market_scan.category WHERE code = 'ELECTRONICS'), 'DECORATION');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('watches', '',  (SELECT id FROM market_scan.category WHERE code = 'ELECTRONICS'), 'WATCHES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('health care', '',  (SELECT id FROM market_scan.category WHERE code = 'ELECTRONICS'), 'HEALTH_CARE');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('miscellaneous', '',  (SELECT id FROM market_scan.category WHERE code = 'ELECTRONICS'), 'MISC_ELECTRONICS');

INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('vegetables', '',  (SELECT id FROM market_scan.category WHERE code = 'FRESH_PLANTS'), 'VEG');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('fruit', '',  (SELECT id FROM market_scan.category WHERE code = 'FRESH_PLANTS'), 'FRUITS');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('plants', '',  (SELECT id FROM market_scan.category WHERE code = 'FRESH_PLANTS'), 'PLANTS');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('miscellaneous', '',  (SELECT id FROM market_scan.category WHERE code = 'FRESH_PLANTS'), 'MISC_FRESH_PLANTS');

INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('spices', '', (SELECT id FROM market_scan.category WHERE code = 'GROCERIES'), 'SPICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('bakery items', '', (SELECT id FROM market_scan.category WHERE code = 'GROCERIES'), 'BAKERY');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('pulses\lentils', '', (SELECT id FROM market_scan.category WHERE code = 'GROCERIES'), 'PULSES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('beverages', '', (SELECT id FROM market_scan.category WHERE code = 'GROCERIES'), 'BEVERAGES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('baby food', '', (SELECT id FROM market_scan.category WHERE code = 'GROCERIES'), 'BABY_FOOD');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('pet food', '', (SELECT id FROM market_scan.category WHERE code = 'GROCERIES'), 'PET_FOOD');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('cooking oil\ghee', '', (SELECT id FROM market_scan.category WHERE code = 'GROCERIES'), 'OIL_GHEE');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('miscellaneous', '', (SELECT id FROM market_scan.category WHERE code = 'GROCERIES'), 'MISC_GROCERIES');

INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('allopathic medicine', '', (SELECT id FROM market_scan.category WHERE code = 'MEDICAL'), 'ALLPATHIC');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('ayurvedic medicine', '', (SELECT id FROM market_scan.category WHERE code = 'MEDICAL'), 'AYURVEDIC');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('supplement & nutrition', '', (SELECT id FROM market_scan.category WHERE code = 'MEDICAL'), 'NUTRITION');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('equipment', '', (SELECT id FROM market_scan.category WHERE code = 'MEDICAL'), 'EQUIPMENTS');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('miscellaneous', '', (SELECT id FROM market_scan.category WHERE code = 'MEDICAL'), 'MISC_MEDICAL');

INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('kitchen appliances', '', (SELECT id FROM market_scan.category WHERE code = 'HOUSEHOLDS'), 'KITCHEN_HOUSEHOLD');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('kitchen ware', '', (SELECT id FROM market_scan.category WHERE code = 'HOUSEHOLDS'), 'KITCHEN_WARE');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('furniture', '', (SELECT id FROM market_scan.category WHERE code = 'HOUSEHOLDS'), 'FURNITURE');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('home decoration', '', (SELECT id FROM market_scan.category WHERE code = 'HOUSEHOLDS'), 'HOME_DECORATION');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('hardware', '', (SELECT id FROM market_scan.category WHERE code = 'HOUSEHOLDS'),'HARDWARE');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('personal care', '', (SELECT id FROM market_scan.category WHERE code = 'HOUSEHOLDS'), 'DAILY_PERSONAL_CARE');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('stationary', '', (SELECT id FROM market_scan.category WHERE code = 'HOUSEHOLDS'), 'STATIONARY');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('miscellaneous', '', (SELECT id FROM market_scan.category WHERE code = 'HOUSEHOLDS'), 'MISC_HOUSEHOLD');

INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('wearable', '', (SELECT id FROM market_scan.category WHERE code = 'SPORTS'), 'SPORTS_WEAR');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('goods', '', (SELECT id FROM market_scan.category WHERE code = 'SPORTS'), 'SPORTS_GOODS');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('equipment', '', (SELECT id FROM market_scan.category WHERE code = 'SPORTS'), 'SPORTS_EQUIPMENT');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('supplement & nutrition', '', (SELECT id FROM market_scan.category WHERE code = 'SPORTS'), 'SPORT_SUPPLIMENTS');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('bags', '', (SELECT id FROM market_scan.category WHERE code = 'SPORTS'), 'SPORTS_BAGS');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('miscellaneous', '', (SELECT id FROM market_scan.category WHERE code = 'SPORTS'), 'MISC_SPORTS');


INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('infant food', '', (SELECT id FROM market_scan.category WHERE code = 'KIDS_WORLD'), 'FOOD_INFANTS');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('food for kids', '', (SELECT id FROM market_scan.category WHERE code = 'KIDS_WORLD'), 'FOOD_KIDS');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('infant baby boy clothing', '', (SELECT id FROM market_scan.category WHERE code = 'KIDS_WORLD'), 'CLOTHES_INFANT_BOY');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('infant baby girl clothing', '', (SELECT id FROM market_scan.category WHERE code = 'KIDS_WORLD'), 'CLOTHES_INFANT_GIRL');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('boy clothing', '', (SELECT id FROM market_scan.category WHERE code = 'KIDS_WORLD'), 'CLOTHES_BOY');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('girl clothing', '', (SELECT id FROM market_scan.category WHERE code = 'KIDS_WORLD'), 'CLOTHES_GIRL');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('stationary', '', (SELECT id FROM market_scan.category WHERE code = 'KIDS_WORLD'), 'STATIONARY_KIDS');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('boy toys', '', (SELECT id FROM market_scan.category WHERE code = 'KIDS_WORLD'), 'TOYS_BOY');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('girl toys', '', (SELECT id FROM market_scan.category WHERE code = 'KIDS_WORLD'), 'TOYS_GIRL');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('infant toys', '', (SELECT id FROM market_scan.category WHERE code = 'KIDS_WORLD'), 'TOYS_INFANT');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('baby care', '', (SELECT id FROM market_scan.category WHERE code = 'KIDS_WORLD'), 'PERSONAL_CARE_BABY');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('infant boy footwear', '', (SELECT id FROM market_scan.category WHERE code = 'KIDS_WORLD'), 'FOOTWEAR_INFANT_BOY');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('infant girl footwear', '', (SELECT id FROM market_scan.category WHERE code = 'KIDS_WORLD'), 'FOOTWEAR_INFANT_GIRL');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('boy footwear', '', (SELECT id FROM market_scan.category WHERE code = 'KIDS_WORLD'), 'FOOTWEAR_BOY');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('girl footwear', '', (SELECT id FROM market_scan.category WHERE code = 'KIDS_WORLD'), 'FOOTWEAR_GIRL');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('supplement & nutrition', '', (SELECT id FROM market_scan.category WHERE code = 'KIDS_WORLD'), 'NUTRITION_KIDS');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('kids furniture', '', (SELECT id FROM market_scan.category WHERE code = 'KIDS_WORLD'), 'FURNITURE_KIDS');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('infant furniture', '', (SELECT id FROM market_scan.category WHERE code = 'KIDS_WORLD'), 'FURNITURE_INFANT');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('kids room decoration', '', (SELECT id FROM market_scan.category WHERE code = 'KIDS_WORLD'), 'DECORATION_KIDS');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('miscellaneous', '', (SELECT id FROM market_scan.category WHERE code = 'KIDS_WORLD'), 'MISC_KIDS_WORLD');

INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('clothing', '', (SELECT id FROM market_scan.category WHERE code = 'MEN_WORLD'), 'CLOTHES_MEN');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('footwear', '', (SELECT id FROM market_scan.category WHERE code = 'MEN_WORLD'), 'FOOTWEAR_MEN');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('watches', '', (SELECT id FROM market_scan.category WHERE code = 'MEN_WORLD'), 'WATCHES_MEN');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('bags', '', (SELECT id FROM market_scan.category WHERE code = 'MEN_WORLD'), 'BAGS_MEN');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('eye wear', '', (SELECT id FROM market_scan.category WHERE code = 'MEN_WORLD'), 'EYE_WEAR_MEN');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('accessories', '', (SELECT id FROM market_scan.category WHERE code = 'MEN_WORLD'), 'ACCESSORIES_MEN');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('grooming equipments', '', (SELECT id FROM market_scan.category WHERE code = 'MEN_WORLD'), 'GROOMING_MEN');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('personal care', '', (SELECT id FROM market_scan.category WHERE code = 'MEN_WORLD'), 'PERSONAL_CARE_MEN');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('health care', '', (SELECT id FROM market_scan.category WHERE code = 'MEN_WORLD'), 'HEATH_CARE_MEN');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('miscellaneous', '', (SELECT id FROM market_scan.category WHERE code = 'MEN_WORLD'), 'MISC_MEN');

INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('clothing', '', (SELECT id FROM market_scan.category WHERE code = 'WOMEN_WORLD'), 'CLOTHES_WOMEN');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('footwear', '', (SELECT id FROM market_scan.category WHERE code = 'WOMEN_WORLD'), 'FOOTWEAR_WOMEN');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('watches', '', (SELECT id FROM market_scan.category WHERE code = 'WOMEN_WORLD'), 'WATCHES_WOMEN');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('bags', '', (SELECT id FROM market_scan.category WHERE code = 'WOMEN_WORLD'), 'BAGS_WOMEN');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('eye wear', '', (SELECT id FROM market_scan.category WHERE code = 'WOMEN_WORLD'), 'EYE_WEAR_WOMEN');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('accessories', '', (SELECT id FROM market_scan.category WHERE code = 'WOMEN_WORLD'), 'ACCESSORIES_WOMEN');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('grooming equipments', '', (SELECT id FROM market_scan.category WHERE code = 'WOMEN_WORLD'), 'GROOMING_WOMEN');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('personal care', '', (SELECT id FROM market_scan.category WHERE code = 'WOMEN_WORLD'), 'PERSONAL_CARE_WOMEN');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('health care', '', (SELECT id FROM market_scan.category WHERE code = 'WOMEN_WORLD'), 'HEATH_CARE_WOMEN');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('miscellaneous', '', (SELECT id FROM market_scan.category WHERE code = 'WOMEN_WORLD'), 'MISC_WOMEN');

INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('programing', '', (SELECT id FROM market_scan.category WHERE code = 'BOOKS'), 'PROGRAMMING_BOOKS');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('litrature', '', (SELECT id FROM market_scan.category WHERE code = 'BOOKS'), 'LITRATURE_BOOKS');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('acedmic', '', (SELECT id FROM market_scan.category WHERE code = 'BOOKS'), 'ACEDMIC_BOOKS');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('comic', '', (SELECT id FROM market_scan.category WHERE code = 'BOOKS'), 'COMIC_BOOKS');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('recipe', '', (SELECT id FROM market_scan.category WHERE code = 'BOOKS'), 'RECIPE_BOOKS');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('business', '', (SELECT id FROM market_scan.category WHERE code = 'BOOKS'), 'BUSINESS_BOOKS');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('miscellaneous', '', (SELECT id FROM market_scan.category WHERE code = 'BOOKS'), 'MISC_BOOKS');

INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('pest control services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'PEST_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('accounting services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'ACCOUNTING_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('car repair', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'CAR_REPAIR_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('bike repair', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'BIKE_REPAIR_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('tuition services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'TUITION_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('bridal services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'BRIDAL_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('transport services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'TRANSPORT_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('taxi services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'TAXI_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('cleaning services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'CLEANING_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('decorating services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'DECORATION_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('electrical services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'ELECTRICAL_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('event planning services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'EVENT_PLANNING_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('hair salons', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'HAIR_SALOON_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('interior decoration', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'INTERIOR_DECORATION_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('house architecture services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'ARCHITECT_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('lawn and garden services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'GARDEN_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('packers and movers services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'PACKER_MOVER_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('courier services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'COURIER_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('travel agencies', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'TRAVEL_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('painting services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'PAINING_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('pet care services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'PET_CARE_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('real estate services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'REAL_STATE_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('plumbing services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'PLUMBING_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('photography\video services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'PHOTOGRAPHY_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('printing services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'PRINTING_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('computer repair services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'COMPUTER_REPAIR_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('gym\fitness services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'GYM_FITNES_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('security services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'SECURITY_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('construction services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'CONSTRUCTION_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('renovation services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'RENOVATION_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('advertisement services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'ADVERTISEMENT_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('medical services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'MEDICAL_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('mobile repair', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'MOBILE_REPAIR_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('stitching services\boutique', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'STICHING_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('education services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'EDUCATION_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('child care services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'CHILD_CARE_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('dj services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'DJ_SOUND_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('catering services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'CATERING_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('career counselling services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'CAREER_COUNSELLING_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('employment services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'EMPLOYMENT_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('domestic help services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'DOMESTIC_HELP_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('hostel services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'HOSTEL_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('grinding\extraction services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'GRINDING_EXTRACTION_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('wedding services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'WEDDING_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('automation services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'AUTOMATION_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('entertainment services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'ENTERTAINMENT_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('fast food services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'FAST_FOOD_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('legal services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'LEGAL_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('staffing\recruitment', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'STAFFING_RECRUITMENT_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('make-up services', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'MAKEUP_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('religious ritual', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'RELIGIOUS_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('driving school', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'DRIVING_SERVICES');
INSERT INTO market_scan.subcategory(name_english, name_hindi, category, code) VALUES ('miscellaneous', '', (SELECT id FROM market_scan.category WHERE code = 'SERVICES'), 'MISC_SERVICES');

------------------------------------------------------------------------------------------------------------------
-- Reset sequence option
ALTER SEQUENCE market_scan.state_id_seq RESTART WITH 1;
----
INSERT INTO market_scan.state(name_english, name_hindi, code) VALUES ('Uttar Pradesh (UP)', '', 'UP');
--------------------------------------------------------------------------------------------------
-- Reset sequence option
ALTER SEQUENCE market_scan.city_id_seq RESTART WITH 1;
----
INSERT INTO market_scan.city(name_english, name_hindi, state, code) VALUES ('meerut', '', (SELECT id FROM market_scan.state WHERE code = 'UP'), 'MUT');
---------------------------------------------------------------------------------------------------
-- Reset sequence option
ALTER SEQUENCE market_scan.brand_id_seq RESTART WITH 1;
----
INSERT INTO market_scan.brand(name_english, name_hindi, code) VALUES ('undefined', '', 'UNDEFINED');
INSERT INTO market_scan.brand(name_english, name_hindi, code) VALUES ('ramdev', '', 'RAMDEV');
INSERT INTO market_scan.brand(name_english, name_hindi, code) VALUES ('oReilly', '', 'O_REILLY');
INSERT INTO market_scan.brand(name_english, name_hindi, code) VALUES ('Vidya Prakashan', '', 'VIDYA_PRAKASHAN');

------------------------------------------------------------------------------------------------
--							ITEM table dataload
------------------------------------------------------------------------------------------------


-- Reset sequence option
ALTER SEQUENCE market_scan.item_id_seq RESTART WITH 1;

-- Grocery data load
INSERT INTO market_scan.item(name_english, name_hindi, unit, subcategory, brand) VALUES ('hing', '', 'per gram', (SELECT id FROM market_scan.subcategory WHERE code = 'SPICES'),(SELECT id FROM market_scan.brand WHERE code = 'RAMDEV'));

-- Books
INSERT INTO market_scan.item(name_english, name_hindi, unit, subcategory, brand) VALUES ('C programming', '', 'per copy', (SELECT id FROM market_scan.subcategory WHERE code = 'PROGRAMMING_BOOKS'),(SELECT id FROM market_scan.brand WHERE code = 'O_REILLY'));
INSERT INTO market_scan.item(name_english, name_hindi, unit, subcategory, brand) VALUES ('C++ programming', '', 'per copy', (SELECT id FROM market_scan.subcategory WHERE code = 'PROGRAMMING_BOOKS'),(SELECT id FROM market_scan.brand WHERE code = 'O_REILLY'));
INSERT INTO market_scan.item(name_english, name_hindi, unit, subcategory, brand) VALUES ('Java programming', '', 'per copy', (SELECT id FROM market_scan.subcategory WHERE code = 'PROGRAMMING_BOOKS'),(SELECT id FROM market_scan.brand WHERE code = 'O_REILLY'));
INSERT INTO market_scan.item(name_english, name_hindi, unit, subcategory, brand) VALUES ('Effective Java', '', 'per copy', (SELECT id FROM market_scan.subcategory WHERE code = 'PROGRAMMING_BOOKS'),(SELECT id FROM market_scan.brand WHERE code = 'O_REILLY'));

INSERT INTO market_scan.item(name_english, name_hindi, unit, subcategory, brand) VALUES ('Airthmatic', '', 'per copy', (SELECT id FROM market_scan.subcategory WHERE code = 'ACEDMIC_BOOKS'),(SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'));
INSERT INTO market_scan.item(name_english, name_hindi, unit, subcategory, brand) VALUES ('Numerical Analysis', '', 'per copy', (SELECT id FROM market_scan.subcategory WHERE code = 'ACEDMIC_BOOKS'),(SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'));
INSERT INTO market_scan.item(name_english, name_hindi, unit, subcategory, brand) VALUES ('Organic Chemistry', '', 'per copy', (SELECT id FROM market_scan.subcategory WHERE code = 'ACEDMIC_BOOKS'),(SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'));
INSERT INTO market_scan.item(name_english, name_hindi, unit, subcategory, brand) VALUES ('Real Theory', '', 'per copy', (SELECT id FROM market_scan.subcategory WHERE code = 'ACEDMIC_BOOKS'),(SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'));
INSERT INTO market_scan.item(name_english, name_hindi, unit, subcategory, brand) VALUES ('Inorganic Chemistry', '', 'per copy', (SELECT id FROM market_scan.subcategory WHERE code = 'ACEDMIC_BOOKS'),(SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'));
INSERT INTO market_scan.item(name_english, name_hindi, unit, subcategory, brand) VALUES ('Physical Chemistry', '', 'per copy', (SELECT id FROM market_scan.subcategory WHERE code = 'ACEDMIC_BOOKS'),(SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'));
INSERT INTO market_scan.item(name_english, name_hindi, unit, subcategory, brand) VALUES ('Mordern Alzebra', '', 'per copy', (SELECT id FROM market_scan.subcategory WHERE code = 'ACEDMIC_BOOKS'),(SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'));
INSERT INTO market_scan.item(name_english, name_hindi, unit, subcategory, brand) VALUES ('Dynamics', '', 'per copy', (SELECT id FROM market_scan.subcategory WHERE code = 'ACEDMIC_BOOKS'),(SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'));
INSERT INTO market_scan.item(name_english, name_hindi, unit, subcategory, brand) VALUES ('Nuclear Physics', '', 'per copy', (SELECT id FROM market_scan.subcategory WHERE code = 'ACEDMIC_BOOKS'),(SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'));
INSERT INTO market_scan.item(name_english, name_hindi, unit, subcategory, brand) VALUES ('Relative Theory', '', 'per copy', (SELECT id FROM market_scan.subcategory WHERE code = 'ACEDMIC_BOOKS'),(SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'));
INSERT INTO market_scan.item(name_english, name_hindi, unit, subcategory, brand) VALUES ('Quantum Physics', '', 'per copy', (SELECT id FROM market_scan.subcategory WHERE code = 'ACEDMIC_BOOKS'),(SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'));
INSERT INTO market_scan.item(name_english, name_hindi, unit, subcategory, brand) VALUES ('Statistics', '', 'per copy', (SELECT id FROM market_scan.subcategory WHERE code = 'ACEDMIC_BOOKS'),(SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'));
INSERT INTO market_scan.item(name_english, name_hindi, unit, subcategory, brand) VALUES ('Calculus', '', 'per copy', (SELECT id FROM market_scan.subcategory WHERE code = 'ACEDMIC_BOOKS'),(SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'));
INSERT INTO market_scan.item(name_english, name_hindi, unit, subcategory, brand) VALUES ('Trignometry', '', 'per copy', (SELECT id FROM market_scan.subcategory WHERE code = 'ACEDMIC_BOOKS'),(SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'));
INSERT INTO market_scan.item(name_english, name_hindi, unit, subcategory, brand) VALUES ('Cordinates', '', 'per copy', (SELECT id FROM market_scan.subcategory WHERE code = 'ACEDMIC_BOOKS'),(SELECT id FROM market_scan.brand WHERE code = 'VIDYA_PRAKASHAN'));
------------------------------------------------------------------------------------------------------------------

-- contact detail
-- Reset sequence option
ALTER SEQUENCE market_scan.contact_detail_id_seq RESTART WITH 1;
----
INSERT INTO market_scan.contact_detail(shop_name_english, shop_name_hindi, mobile, landline, whatsapp,email, address_line1, addressline2, landmark, town_or_locality, city, longitude, lattitude)
VALUES ('shop-1', '', '9412704799', '01212556599', '9412704799','a@b.c', 'add-1', 'add-2', 'landmark-1', 'town-1', (SELECT id FROM market_scan.city WHERE code = 'MUT'), '0.123456', '1.123456');
INSERT INTO market_scan.contact_detail(shop_name_english, shop_name_hindi, mobile, landline, whatsapp,email, address_line1, addressline2, landmark, town_or_locality, city, longitude, lattitude)
VALUES ('shop-2', '', '9412714799', '01213556599', '9412714799','b@b.c', 'add-2', 'add-3', 'landmark-2', 'town-2', (SELECT id FROM market_scan.city WHERE code = 'MUT'), '0.123457', '1.123457');
INSERT INTO market_scan.contact_detail(shop_name_english, shop_name_hindi, mobile, landline, whatsapp,email, address_line1, addressline2, landmark, town_or_locality, city, longitude, lattitude)
VALUES ('shop-3', '', '9412724491', '012145565991', '9412724791','d@b.c', 'add-4', 'add-4', 'landmark-4', 'town-4', (SELECT id FROM market_scan.city WHERE code = 'MUT'), '0.1234581', '1.1234581');
INSERT INTO market_scan.contact_detail(shop_name_english, shop_name_hindi, mobile, landline, whatsapp,email, address_line1, addressline2, landmark, town_or_locality, city, longitude, lattitude)
VALUES ('shop-4', '', '9412704292', '012125565992', '9412704399','e@b.c', 'add-5', 'add-5', 'landmark-5', 'town-5', (SELECT id FROM market_scan.city WHERE code = 'MUT'), '0.1234516', '1.1234561');
INSERT INTO market_scan.contact_detail(shop_name_english, shop_name_hindi, mobile, landline, whatsapp,email, address_line1, addressline2, landmark, town_or_locality, city, longitude, lattitude)
VALUES ('shop-5', '', '9412747993', '012125565993', '9412704099','f@b.c', 'add-6', 'add-6', 'landmark-6', 'town-6', (SELECT id FROM market_scan.city WHERE code = 'MUT'), '0.1234566', '1.1234566');

-- role table
-- Reset sequence option
ALTER SEQUENCE market_scan.role_id_seq RESTART WITH 1;
----
INSERT INTO market_scan.role(name, code) VALUES ('Seller', 'SELLER');
INSERT INTO market_scan.role(name, code) VALUES ('Buyer', 'BUYER');


-- user table
-- Reset sequence option
ALTER SEQUENCE market_scan.user_id_seq RESTART WITH 1;
----
INSERT INTO market_scan.user(name_english, name_hindi, nick_name, is_active, is_delivery_available, universally_unique_identifiers, device_id, mac_address, ip_address, registration_date, contact_detail, role)
VALUES ('A', '', '', true, true, '11110001', 'm00123456', 'D0-53-49-55-20-E3', '192.168.1.1', null, 1, (SELECT id FROM market_scan.role WHERE code = 'SELLER'));
INSERT INTO market_scan.user(name_english, name_hindi, nick_name, is_active, is_delivery_available, universally_unique_identifiers, device_id, mac_address, ip_address, registration_date, contact_detail, role)
VALUES ('B', '', '', true, true, '11110011', 'm00123457', 'D0-53-49-55-20-E4', '192.168.1.2', null, 2, (SELECT id FROM market_scan.role WHERE code = 'SELLER'));
INSERT INTO market_scan.user(name_english, name_hindi, nick_name, is_active, is_delivery_available, universally_unique_identifiers, device_id, mac_address, ip_address, registration_date, contact_detail, role)
VALUES ('C', '', '', true, false, '1111002', 'm00123458', 'D0-53-49-55-20-E5', '192.168.1.3', null, 3, (SELECT id FROM market_scan.role WHERE code = 'SELLER'));
INSERT INTO market_scan.user(name_english, name_hindi, nick_name, is_active, is_delivery_available, universally_unique_identifiers, device_id, mac_address, ip_address, registration_date, contact_detail, role)
VALUES ('D', '', '', true, true, '1111003', 'm00123459', 'D0-53-49-55-20-E6', '192.168.1.4', null, 4, (SELECT id FROM market_scan.role WHERE code = 'SELLER'));
INSERT INTO market_scan.user(name_english, name_hindi, nick_name, is_active, is_delivery_available, universally_unique_identifiers, device_id, mac_address, ip_address, registration_date, contact_detail, role)
VALUES ('E', '', '', true, false, '11110033', 'm001234511', 'D0-53-49-55-20-E7', '192.168.1.5', null, 5, (SELECT id FROM market_scan.role WHERE code = 'SELLER'));

-- deal table
-- Reset sequence option
ALTER SEQUENCE market_scan.deal_id_seq RESTART WITH 1;
----
INSERT INTO market_scan.deal(item, seller, deal_published_date, deal_expiry_date, brand, normal_price, deal_price, item_expiry)
VALUES (5, 1, '2016-06-11', '2016-06-13', (SELECT id FROM market_scan.brand WHERE code = 'O_REILLY'), 1000, 890, null);
INSERT INTO market_scan.deal(item, seller, deal_published_date, deal_expiry_date, brand, normal_price, deal_price, item_expiry)
VALUES (5, 2, '2016-06-09', '2016-06-13', (SELECT id FROM market_scan.brand WHERE code = 'O_REILLY'), 1000, 891, null);
INSERT INTO market_scan.deal(item, seller, deal_published_date, deal_expiry_date, brand, normal_price, deal_price, item_expiry)
VALUES (5, 3, '2016-06-06', '2016-06-13', (SELECT id FROM market_scan.brand WHERE code = 'O_REILLY'), 1000, 880, null);
INSERT INTO market_scan.deal(item, seller, deal_published_date, deal_expiry_date, brand, normal_price, deal_price, item_expiry)
VALUES (5, 4, '2016-06-10', '2016-06-15', (SELECT id FROM market_scan.brand WHERE code = 'O_REILLY'), 1000, 889, null);
INSERT INTO market_scan.deal(item, seller, deal_published_date, deal_expiry_date, brand, normal_price, deal_price, item_expiry)
VALUES (5, 5, '2016-06-12', '2016-06-13', (SELECT id FROM market_scan.brand WHERE code = 'O_REILLY'), 1000, 891.5, null);

