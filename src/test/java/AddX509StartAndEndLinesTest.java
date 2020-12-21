import org.junit.Test;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class AddX509StartAndEndLinesTest {
    final String validCertificate = "src/test/resources/formattedCertificateBase64StringWithStartAndEndLines";
    final String formattedCertificateStringFile = "src/test/resources/formattedCertificateBase64String";

    @Test
    public void itShouldAddAStandardX509StartAndEndLineToAnyString() throws IOException {
        String plainFormattedX509Cert = new LoadCertificateBase64String()
                .loadStringFromFile(formattedCertificateStringFile);
        String expected = new LoadCertificateBase64String().loadStringFromFile(validCertificate);
        String actual = new AddX509StartAndEndLines().encapsulateCert(plainFormattedX509Cert);

        assertThat("it must add a certificate start and end line", actual,is(equalTo(expected)));
    }
}
