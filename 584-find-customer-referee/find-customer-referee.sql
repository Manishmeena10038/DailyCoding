-- # Write your MySQL query statement below
-- select name from Customer
-- where  referee_id!="2"or referee_id is null;

#using nested loop 1st select all the referee_id= 2 then
# select all those without id =2.
SELECT name
FROM Customer
WHERE id NOT IN
        (
        SELECT id
        FROM Customer
        WHERE referee_id = 2

        )