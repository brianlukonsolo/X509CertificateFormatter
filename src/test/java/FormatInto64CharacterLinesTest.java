import com.brianlukonsolo.operations.FormatInto64CharacterLines;
import com.brianlukonsolo.operations.LoadCertificateBase64String;
import org.junit.Test;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class FormatInto64CharacterLinesTest {
    final String formattedCertificateStringFile = "src/test/resources/formattedCertificateBase64String";
    final String certificateStringFile = "src/test/resources/dummyX509CertificateString";

    @Test
    public void itShouldFormatAnyStringInto64CharacterLines() throws IOException {
        String expected = new LoadCertificateBase64String().loadStringFromFile(formattedCertificateStringFile);
        String loadedX509CertBas64String = new LoadCertificateBase64String().loadStringFromFile(certificateStringFile);
        String actual = new FormatInto64CharacterLines()
                .format(64, loadedX509CertBas64String);
        assertThat("certificate must be formatted into 64 char lines", actual, is(equalTo(expected)));
    }
}
