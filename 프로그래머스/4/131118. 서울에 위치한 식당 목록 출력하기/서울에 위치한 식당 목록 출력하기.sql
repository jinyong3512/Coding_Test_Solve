# 서울에 위치한 식당들
# 식당 ID, 식당 이름, 음식 종류, 즐겨찾기수, 주소, 리뷰 평균 점수를 조회

SELECT
    I.REST_ID AS REST_ID,
    I.REST_NAME AS REST_NAME,
    I.FOOD_TYPE AS FOOD_TYPE,
    I.FAVORITES AS FAVORITES,
    I.ADDRESS AS ADDRESS,
    ROUND(R.AVG_REVIEW_SCORE,2) AS SCORE
FROM
    REST_INFO AS I
INNER JOIN
    (
    SELECT
        REST_ID,
        AVG(REVIEW_SCORE) AS AVG_REVIEW_SCORE
    FROM
        REST_REVIEW
    GROUP BY
        REST_ID
    ) AS R ON I.REST_ID = R.REST_ID
WHERE
    I.ADDRESS LIKE '서울%'
ORDER BY
    R.AVG_REVIEW_SCORE DESC,
    FAVORITES DESC