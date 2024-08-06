# Write your MySQL query statement below

select person_name from 
(select person_name,turn, weight,sum(weight) over (order by turn) as wg from Queue ) x
where wg<=1000
order by wg desc
limit 1
