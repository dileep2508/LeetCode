# Write your MySQL query statement below
select customer_id, count(*) count_no_trans
from Visits v
LEFT JOIN Transactions t
ON v.visit_id = t.visit_id
where t.transaction_id is null
Group by customer_id;