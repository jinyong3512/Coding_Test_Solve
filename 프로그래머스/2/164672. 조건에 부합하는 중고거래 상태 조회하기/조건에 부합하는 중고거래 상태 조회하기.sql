SELECT
    BOARD_ID,
    WRITER_ID,
    TITLE,
    PRICE,
    IF(
        STATUS = 'SALE',
        '판매중',
        IF(
            STATUS = 'RESERVED',
            '예약중',
            '거래완료'
        )
      ) AS 거래상태
FROM
    USED_GOODS_BOARD
WHERE
    DATE_FORMAT(CREATED_DATE,'%Y-%m-%d') = '2022-10-05'
ORDER BY
    BOARD_ID DESC