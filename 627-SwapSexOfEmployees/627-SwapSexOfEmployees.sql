-- Last updated: 7/9/2026, 3:06:42 PM
UPDATE salary SET sex =
CASE sex
    WHEN 'm' THEN 'f'
    ELSE 'm'
END;