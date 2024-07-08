-- 코드를 입력하세요
# SELECT HOUR(DATETIME) HOUR, COUNT(*) COUNT
# FROM ANIMAL_OUTS
# WHERE HOUR(DATETIME) BETWEEN 9 AND 19
# GROUP BY HOUR(DATETIME)
# ORDER BY HOUR(DATETIME);

SELECT 
    DATE_FORMAT(DATETIME, '%H') AS HOUR,
    COUNT(*)
FROM
    ANIMAL_OUTS
WHERE
    '09' <= DATE_FORMAT(DATETIME, '%H') AND DATE_FORMAT(DATETIME, '%H') <= '19'
GROUP BY
    DATE_FORMAT(DATETIME, '%H')
ORDER BY
    HOUR