package lk.mydentist.api.service.impl;

import lk.mydentist.api.dto.VersionDto;
import lk.mydentist.api.model.Version;
import lk.mydentist.api.repository.VersionRepo;
import lk.mydentist.api.service.VersionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VersionServiceImpl implements VersionService {
    private final VersionRepo versionRepo;

    @Autowired
    public VersionServiceImpl(VersionRepo versionRepo) {
        this.versionRepo = versionRepo;
    }

    @Override
    public VersionDto getVersion() {
        Version version = this.versionRepo.getTopByOrderByIdDesc();
        return new VersionDto(version);
    }

    @Override
    public VersionDto saveVersion(VersionDto versionDto) {
        Version version = this.dtoToEntity(versionDto);
        Version savedVersion = this.versionRepo.save(version);
        return new VersionDto(savedVersion);
    }

    private Version dtoToEntity(VersionDto versionDto) {
        Version version = new Version();
        BeanUtils.copyProperties(versionDto, version);
        return version;
    }

}
