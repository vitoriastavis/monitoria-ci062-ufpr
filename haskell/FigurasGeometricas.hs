module FigurasGeometricas where

area_quadrado :: Int -> Int -> Int
area_quadrado a b = a*b

area_retangulo :: Int -> Int -> Int
area_retangulo a b = a*b

area_triangulo :: Int -> Int -> Int
area_triangulo a b = a*b `div` 2

area_triangulo_float :: Float -> Float -> Float
area_triangulo_float a b = (a*b)/2
