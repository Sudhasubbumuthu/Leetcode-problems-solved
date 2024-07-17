# Write your MySQL query statement below
select product.product_name, sales.year, sales.price
from sales join product using(product_id) 