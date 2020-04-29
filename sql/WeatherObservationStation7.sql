select distinct CITY from STATION
where (CITY like '%a') OR (CITY like '%e') OR (CITY like '%i') OR (CITY like '%o') OR (CITY like '%u') ;


SELECT DISTINCT CITY FROM STATION WHERE LOWER(RIGHT(CITY,1)) IN ('a','e','i','o','u') AND LOWER(LEFT(CITY,1)) IN ('a','e','i','o','u');

SELECT distinct from STATION where FIND_IN_SET(right(CITY,1),'A,E,I,O,U')>0;

