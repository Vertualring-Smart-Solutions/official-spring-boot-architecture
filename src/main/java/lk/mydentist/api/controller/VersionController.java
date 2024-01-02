package lk.mydentist.api.controller;

import lk.mydentist.api.dto.VersionDto;
import lk.mydentist.api.service.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("version")
public class VersionController {

    private final VersionService versionService;

    @Autowired
    public VersionController(VersionService versionService) {
        this.versionService = versionService;
    }

    @GetMapping
    public VersionDto getVersion() {
        return this.versionService.getVersion();
    }

    @PostMapping
    public VersionDto saveVersion(@RequestBody VersionDto versionDto) {
        versionDto.setId(null);
        return this.versionService.saveVersion(versionDto);
    }

}
