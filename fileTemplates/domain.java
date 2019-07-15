#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import java.io.Serializable;
import lombok.*;

#parse("File Header.java")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ${NAME} implements Serializable{
    private int  
    private String        
    private String        
    private String        
}
