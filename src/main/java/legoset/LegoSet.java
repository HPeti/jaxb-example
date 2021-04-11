package legoset;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

import java.net.URL;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class LegoSet {

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private List<String> tags;

    @XmlAttribute
    private int number;
    private URL url;

}