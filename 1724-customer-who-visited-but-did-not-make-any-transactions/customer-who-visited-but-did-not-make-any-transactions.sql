# Write your MySQL query statement below
select a.customer_id, count(a.visit_id) as count_no_trans 
from Visits a left join Transactions t
on a.visit_id = t.visit_id 
where t.transaction_id is null
group by a.customer_id