-- Last updated: 7/9/2026, 3:06:20 PM
select p.product_name , s.year , s.price
from Sales as s
Left Join Product as p
ON s.product_id = p.product_id