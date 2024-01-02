package lk.mydentist.api.dto;

import lk.mydentist.api.model.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VersionDto {
    private Long id;
    private String version;
    private Date releaseDate;

    public VersionDto(Version version) {
        BeanUtils.copyProperties(version, this);
    }
}
