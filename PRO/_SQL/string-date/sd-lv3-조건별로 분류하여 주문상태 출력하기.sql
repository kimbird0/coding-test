SELECT ORDER_ID, PRODUCT_ID, DATE_FORMAT(OUT_DATE, '%Y-%m-%d') AS OUT_DATE,
       CASE
           WHEN MONTH(OUT_DATE) = 5 AND DAY(OUT_DATE) = 1 THEN '출고완료'
           WHEN MONTH(OUT_DATE) < 5 THEN '출고완료'
           WHEN MONTH(OUT_DATE) >= 5 THEN '출고대기'
           ELSE '출고미정'
           END AS 출고여부
FROM FOOD_ORDER
ORDER BY ORDER_ID