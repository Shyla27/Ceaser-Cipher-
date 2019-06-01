import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CeaserCipherTest{


    public CeaserCipherTest(String password, int key) {
	}


	public CeaserCipherTest(Object encryption, int key) {
	}


	@Test
    public void rotateCharacter_ShiftsCharacterCorrectNumberofTimesAtEndOfAlphabet_char(){
        char input='x';
        char expectedOutput='h';
        assertEquals(expectedOutput, CeaserCipherTest.cipher(input, "1"));
    }


    static Object cipher(int i, String string) {
        return null;
    }

    @Test
    public void rotateCharacter_ShiftsCharacterCorrectNumberofTimes_char(){
        char input='b';
        char expectedOutput='i';

        assertEquals(expectedOutput, CeaserCipherTest(input, 7));
    }

    private Object CeaserCipherTest(char input, int i) {
        return null;
    }

    static Object cipher() {
        return null;
    }


	public String cipher(int i, int key) {
		return null;
	}

}
