module CalculoMedia where

-- Retorna numeros de uma sequencia que soma 5
num :: Int -> Float
num a 
    | a == 1 = 5.0
    | a == 2 = 10.0
    | a == 3 = 15.0
    | a == 4 = 20.0
    | a == 5 = 25.0
    | otherwise = error "apenas 5 numeros na sequencia"

-- Soma recursiva
soma :: Int -> Float
soma 0 = 0
soma a = num a + soma(a-1)

-- Media
media :: Int -> Float
media a = soma a / fromIntegral a

main :: IO()
main = do 
    print(media 5)