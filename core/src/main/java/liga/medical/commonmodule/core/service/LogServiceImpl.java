package liga.medical.commonmodule.core.service;

import liga.medical.commonmodule.core.api.LogService;
import liga.medical.commonmodule.core.dto.DebugDto;
import liga.medical.commonmodule.core.dto.ExceptionDto;
import liga.medical.commonmodule.core.model.DebugRecord;
import liga.medical.commonmodule.core.model.ExceptionRecord;
import liga.medical.commonmodule.core.repository.DebugRepository;
import liga.medical.commonmodule.core.repository.ExceptionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class LogServiceImpl implements LogService {

    private final DebugRepository debugRepository;

    private final ExceptionRepository exceptionRepository;

    public LogServiceImpl(DebugRepository debugRepository, ExceptionRepository exceptionRepository) {
        this.debugRepository = debugRepository;
        this.exceptionRepository = exceptionRepository;
    }

    @Override
    public void logDebug(DebugDto debugDto) {
        log.info(debugDto.toString());
        DebugRecord debugRecord = new DebugRecord();
        debugRecord.setUuid(this.getUuid());
        debugRecord.setMethodParams(debugDto.getMethodParams());
        debugRecord.setSystemType(debugDto.getSystemType());
        debugRepository.save(debugRecord);
    }

    @Override
    public void logException(ExceptionDto exceptionDto) {
        log.info(exceptionDto.toString());
        ExceptionRecord exceptionRecord = new ExceptionRecord();
        exceptionRecord.setUuid(this.getUuid());
        exceptionRecord.setMethodParams(exceptionDto.getMethodParams());
        exceptionRecord.setSystemType(exceptionDto.getSystemType());
        exceptionRepository.save(exceptionRecord);
    }

    private String getUuid() {
        return UUID.randomUUID().toString();
    }
}
