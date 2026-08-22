-- Last updated: 8/22/2026, 4:10:35 PM
select Class
from Courses group by Class having count(student)>=5;