module Main where

import FigurasGeometricas

main :: IO()
main = do 
    putStr "Area do quadrado: "
    print(area_quadrado 2 2)
    putStr "Area do triangulo: "
    print(area_triangulo 2 2)
    putStr "Area do triangulo 2: "
    print(area_triangulo_float 2 2)