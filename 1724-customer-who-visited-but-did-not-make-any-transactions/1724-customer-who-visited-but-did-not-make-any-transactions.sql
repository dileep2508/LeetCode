# Write your MySQL query statement below
select c.customer_id, count(*) AS count_no_trans
from Visits c
LEFT JOIN Transactions t 
ON c.visit_id = t.visit_id
where t.transaction_id is NULL
Group by c.customer_id;