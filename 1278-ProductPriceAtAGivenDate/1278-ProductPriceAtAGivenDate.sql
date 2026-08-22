-- Last updated: 8/22/2026, 4:09:27 PM
# Write your MySQL query statement below
with t1 as
(select *, row_number() over (partition by product_id order by change_date desc) as rn from Products where change_date <= '2019-08-16'),
t2 as
(select distinct(product_id) from products)
select t2.product_id, case when t1.new_price is null then 10 else t1.new_price end as price from t2 left join t1 
on t1.product_id=t2.product_id and t1.rn=1;