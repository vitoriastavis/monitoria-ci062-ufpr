module Recursao where

-- Somar todos os números reais no intervalo [0, y], sendo y > 0
soma_valores_if :: Float -> Float
soma_valores_if a = 
            if a == 0
                then 0
            else
                a + soma_valores_if (a-1)

-- Somar todos os números reais no intervalo [0, y], sendo y > 0
soma_valores :: Float -> Float
soma_valores 0 = 0
soma_valores a = a + soma_valores (a-1)

-- Somar todos os números reais no intervalo [0, y], sendo y > 0
soma_valores_g :: Float -> Float
soma_valores_g 0 = 0
soma_valores_g a    | a > 0  = a + soma_valores_g(a-1)
                    | otherwise = error "a"


