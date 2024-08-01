# Write your MySQL query statement below
select p.project_id, ifnull(round(sum(u.experience_years)/count(p.employee_id),2),0) as average_years
from Project P left join Employee u
on p.employee_id = u.employee_id
group by  p.project_id