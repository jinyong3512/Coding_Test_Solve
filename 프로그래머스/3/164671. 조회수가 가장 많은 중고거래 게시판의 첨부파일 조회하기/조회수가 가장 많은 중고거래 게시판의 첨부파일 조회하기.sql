-- 코드를 입력하세요
SELECT
    CONCAT('/home/grep/src/',UGF.BOARD_ID,'/',UGF.FILE_ID,UGF.FILE_NAME,UGF.FILE_EXT) AS FILE_PATH
FROM
    (
    SELECT
        *
    FROM
        USED_GOODS_BOARD
    ORDER BY
        VIEWS DESC
    LIMIT
        1
    ) AS CUGB
INNER JOIN
    USED_GOODS_FILE AS UGF ON CUGB.BOARD_ID = UGF.BOARD_ID
ORDER BY
    UGF.FILE_ID DESC
    
