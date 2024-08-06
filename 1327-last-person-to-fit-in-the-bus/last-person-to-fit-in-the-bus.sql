# Write your MySQL query statement below

with rs as(
     select person_name, sum(weight) over (order by turn) as wg
     from Queue
)
select person_name from rs
where wg<=1000
order by wg desc
limit 1