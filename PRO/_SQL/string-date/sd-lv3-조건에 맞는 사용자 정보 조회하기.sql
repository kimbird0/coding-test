SELECT USER_ID, NICKNAME,
       CONCAT(CITY,SPACE(1), STREET_ADDRESS1, SPACE(1),STREET_ADDRESS2) AS 전체주소,
       CONCAT_ws('-', SUBSTR(TLNO,1,3),SUBSTR(TLNO,4,4),SUBSTR(TLNO,8,11)) AS 전화번호
FROM USED_GOODS_BOARD AS A
         INNER JOIN USED_GOODS_USER  AS B ON A.WRITER_ID = B.USER_ID
GROUP BY WRITER_ID
HAVING COUNT(WRITER_ID) >= 3
ORDER BY USER_ID DESC