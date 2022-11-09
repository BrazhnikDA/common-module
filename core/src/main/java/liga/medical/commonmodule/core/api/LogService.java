package liga.medical.commonmodule.core.api;

import liga.medical.commonmodule.core.dto.DebugDto;
import liga.medical.commonmodule.core.dto.ExceptionDto;

public interface LogService {
    void logDebug(DebugDto debugDto);

    void logException(ExceptionDto exceptionDto);
}