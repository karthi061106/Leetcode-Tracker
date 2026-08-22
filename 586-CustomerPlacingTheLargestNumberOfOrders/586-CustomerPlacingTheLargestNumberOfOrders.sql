-- Last updated: 8/22/2026, 4:10:39 PM
SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY count(order_number) DESC
LIMIT 1;