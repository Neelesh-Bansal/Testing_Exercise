package q4

import spock.lang.Specification

class AdditionTest extends Specification {

    def addition;

    def setup(){
        addition =new Addition();
    }

    def "canaryTest"(){
        println "This is canary test"
    }

    def "when then using setup"(){
        setup:
        def a=15
        def b=20
        when:
        def c=a+b
        then:
        addition.sum(a,b)==c
    }

    def "when then using given"(){
        given:
        def x=10
        def y=20
        when:
        def z=20
        if(addition.sum(x,y)==z)
            println("Passed")
        then:
        println("----")
    }

  // part 2
    def "except using setup"(){
        setup:
        def a=5
        def b=4

        expect:
        addition.sum(a,b)==9
    }

    def "except using given"(){
        given:
        def a=5
        def b=4

        expect:
        addition.sum(a,b)==9
    }


    void "where bolck"() {
        expect:
       addition.sum(a,b)==c

        where:
        a | b | c
        1 | 3 | 4
        7 | 4 | 11
        0 | 0 | 0
    }


    def "let's try this!"() {
        given:
        def c
        def d
        when:
        c = a+b
        then:
        c == result1
        when:
        d = e-f
        then:
        d == result2
        where:
        a | b |result1 | e |f |result2
        1 | 2 | 3      | 7 |5 |2
        2 | 4 | 6      | 9 |11|-2
    }

}
