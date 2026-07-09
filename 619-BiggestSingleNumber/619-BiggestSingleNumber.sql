-- Last updated: 7/9/2026, 3:06:45 PM
SELECT MAX(num) as num
FROM(
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(num) = 1
) AS ans