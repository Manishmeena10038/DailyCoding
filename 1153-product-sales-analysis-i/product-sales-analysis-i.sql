# Write your MySQL query statement below
select p.product_name, s.year as year, s.price as price from 
Sales as s  join Product as p 
using(product_id)