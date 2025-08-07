import com.patrickdd.KArray
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class KArrayTest {


    @Test
    fun testSet(){
        val array = KArray<String>(10)
        val indexOver = { array.set(1234,"!") }
        val indexUnder = { array.set(-1000, "impossible") }

        array.set(0,"zero")
        array.set(1,"HELLO")
        array.set(2,"WORLD")
        array.set(9,"edgeCase")

        assertThrows<IndexOutOfBoundsException>(executable = indexOver)
        assertThrows<IndexOutOfBoundsException>(executable = indexUnder)
    }
}