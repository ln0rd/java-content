## Application logical

So we have here an application thats work with a dynamic discounts, so you need look at the table hash.discounts in database to see the discountes registereds,
this discounts each one has a range of date, and a status column is_enable, a discount only is eligible when is_enable is true or 1, and the discount application only will apply the discount when this discount has been inside the date range.

For example, imagine we have the black_friday discount :
```
+----+------------+--------------+-----------+-------------+------------+
| id | percentage |         name | is_enable |  begin_date |   end_date | 
+----+------------+--------------+-----------+-------------+------------+
|  2 |         5  | black_friday |         1 |  2021-11-25 | 2021-11-25 |
+----+------------+--------------+-----------+-------------+------------+
```
Look, this discount is a commun discount, because it has a range of date, so today just need be between the dates and is_enable be 1(true) and this discount will be applied;

And we have a second kind of discount, a especial discount:
```
+----+------------+--------------+-----------+-------------+------------+
| id | percentage |         name | is_enable |  begin_date |   end_date | 
+----+------------+--------------+-----------+-------------+------------+
|  2 |         5  |     birthday |         1 |        null |       null |
+----+------------+--------------+-----------+-------------+------------+
```
An especial discount doesn't has a range of date, so in this case we need validate it inside the code, so for this the application discount look to the user data of birth
and compare it with today, if month and day are equals we consider his birthday and apply this discount, but the same logical is applied, this discount need be enable.

So, to test it just change this values inside the database to see how the system work!

So... if the discount service were down we always you return 0 in the api service and it won't apply the discount in the product value. 
