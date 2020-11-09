(> 42 17 18)


(+ 1 2 3 4 5 6 7 8 9)

(def a 7)

(+ 1 a 3 4)

(or x y z)

(partial > 42)

(* 1 17)

(def my- >)

(my- > 17 18 23 31)

(> 42 17 18)

; fn nije funkcija nego specijalna forma, zahteva vektor argumenata [] i telo funkcije ()
fn [x]
(> 42 x))

(defn my-fn [x]
  (> 42 x))
my-fn
; razlika izmedju macroa i funkcija
(or nil 7)

(defn my-or [x y]
  if x)

(my-or nil 7)
(my-or 8 nil)
(my-or nil false)

(def my-arg (fn ([x] (println(x))
    ([y] (println(y))
    ([xy] (println(xy))
    ([xy & xs] (println(list))))))))

(my-arg)

(my-arg 1)

(my-arg 17 18)
; napraviti objekte u domenu

; 05/11/2020

;let je specijalna fonma i vidljiva samo u okviru zagrade (let[x 7]...) x je 7 sve dok se ne zatvori zagrada
(fn something [x y]
    (let[z(+ x y)]
    (/(* x y z)z)))
;loop je slicno let
;primer u nastavlju je los nacin
(loop [i 0]
  (println "Pass: " i)
  (if (< i 3))
  (recur(+ 2 i)))

  (loop [i 0]
    (str "Pass: " i))


(defn my-f-test [f x y]
(if (f x y)
  "yey"
    "no"))
(my-f-test println "Pera" "17")
;rekurzija koristi recur. uz njega koristi loop ali i ne mora

;reduce funkcija sabira u ovom primeru sve cifre
(reduce + [17 18 2 11 100])

(first [1 8 18 20])

(rest v);nisam sigurna

(def v 1)
(loop [acc o s (seq v)]
  (if s
    recur (+ acc (first s)) (rest s)));ne radi

(seq v ) ;seq pretvara vektor u sekvencu

(empty? v)

;reduce uzima tri elementa funkciju, 0 i neka sekvenca s
(reduce (fn [acc e] ...))

(conj [...] 1); conjoy dodaje 1 na kraj vektorA
(conj (...) 2); conjoy dodaje 2 na pocetak liste

(cons e s)
(cons [1 2 3] (iterate inc 1)) ; iterate pravi beskonacnu petlju 1, 2, 3, 4...
(def s (iterate inc 17))
(take 10 s)
(reduce (fn [acc e] (if(even? e) (conj acc e) acc)))

(filter even? s)
(reduce + (filter even? s))
