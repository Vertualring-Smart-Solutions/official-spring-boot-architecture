package lk.mydentist.api.service;

import lk.mydentist.api.dto.VersionDto;

public interface VersionService {
    VersionDto getVersion();
    VersionDto saveVersion(VersionDto versionDto);
}
