import org.junit.Test;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class CertificateBase64StringLoaderTest {
    final String certificateStringFile = "src/test/resources/dummyX509CertificateString";
    @Test
    public void itShouldLoadCertificateBase64StringWithoutModifyingIt() throws IOException {
        String expectedString = "abcde";
        String loadedX509CertBas64String = new LoadCertificateBase64String().loadStringFromFile(certificateStringFile);

        assertThat("String is loaded", loadedX509CertBas64String, is(equalTo(expectedString)));
    }

}
