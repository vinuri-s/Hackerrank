select distinct CITY from STATION
where (CITY like 'a%') OR (CITY like 'e%') OR (CITY like 'i%') OR (CITY like 'o%') OR (CITY like 'u%') ;

SELECT DISTINCT CITY FROM STATION WHERE CITY REGEXP '^[AEOIU]';

SELECT DISTINCT CITY FROM STATION WHERE LOWER(LEFT(CITY, 1)) IN ('a','e','i','o','u');

SELECT * from STATION where FIND_IN_SET(left(CITY,1),'A,E,I,O,U')>0;

select distinct CITY from STATION where substring(CITY,1,1) in
('A','E','I','O','U');