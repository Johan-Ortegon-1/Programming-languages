;@Autor: Hector Rodriguez
;Taller Programación Funcional
;1er punto
 (define (es_conmutativa? op x y)     
   (equal? (op x y) (op y x) )
 )   
;2do punto
(define (son_conmutativas? lista x y)
  ( if (null? lista)
    (list)
    (cons (es_conmutativa?(car lista) x y )(son_conmutativas?(cdr lista) x y )) 
  )
)
;3er punto
(define count 0)
(define  (contar_conmutativas lista x y)
  (if(null? lista)
    (+ count 0)
    (+ (if (es_conmutativa? (car lista) x y )
        (+ count 1)
        (+ count 0) 
    ) (contar_conmutativas(cdr lista) x y )) 

)
) 
;Función para crear listas de tamaño arbitrario 
(define (make n v)
(if(= n 0)
  (list)
  (cons v (make (- n 1) v))))
