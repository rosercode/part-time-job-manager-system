package cool.wangshuo.ptms.advice;


import cool.wangshuo.ptms.model.response.GlobalResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangshuo
 * @description
 * @createDate 2022/10/26 16:52
 */

@Slf4j
@RestControllerAdvice
public class GlobalAdvice {

     @ExceptionHandler(value = {BindException.class, ValidationException.class, MethodArgumentNotValidException.class})
    public GlobalResult handleValidatedException(Exception e) {
        log.info(String.valueOf(HttpStatus.BAD_REQUEST.value()));

        if (e instanceof MethodArgumentNotValidException) {
            // BeanValidation exception
            log.info("BeanValidation exception");
            MethodArgumentNotValidException ex = (MethodArgumentNotValidException) e;
            return GlobalResult.error(ex.getBindingResult().getAllErrors().stream()
                    .map(ObjectError::getDefaultMessage)
                    .collect(Collectors.joining("\n")));
        } else if (e instanceof ConstraintViolationException) {
            // BeanValidation GET simple param
            System.out.println("BeanValidation GET simple param");
            ConstraintViolationException ex = (ConstraintViolationException) e;
            return GlobalResult.error(ex.getConstraintViolations().stream()
                    .map(ConstraintViolation::getMessage)
                    .collect(Collectors.joining("\n")));

        } else if (e instanceof BindException) {
            System.out.println("BeanValidation GET object param");
            // BeanValidation GET object param
            BindException ex = (BindException) e;
            return GlobalResult.error(ex.getAllErrors().stream()
                    .map(ObjectError::getDefaultMessage)
                    .collect(Collectors.joining("\n")));
        }
        return GlobalResult.error();
    }
}
