-- 코드를 입력하세요
SELECT AUTHOR_ID, AUTHOR_NAME, CATEGORY, SUM(SALES * PRICE) AS TOTAL_SALES
FROM BOOK_SALES C JOIN (
    SELECT *
    FROM BOOK A JOIN AUTHOR B USING(AUTHOR_ID)
) D USING(BOOK_ID)
WHERE SALES_DATE LIKE "2022-01%"
GROUP BY AUTHOR_ID, AUTHOR_NAME, CATEGORY
ORDER BY AUTHOR_ID, CATEGORY DESC;
