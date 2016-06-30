package in.co.trish.marketscan.web.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.co.trish.marketscan.web.representation.read.UserRegistrationTempResource;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RequestMapping(value = "/API/V1/{apiKey}/SMS")
@RestController
@Api(tags = {
		"Sends an otp to user's mobile" }, produces = "application/json", consumes = "application/json", protocols = "http")
public class UserRegistrationTempRestController {

	private static final Logger log = LoggerFactory.getLogger(UserRegistrationTempRestController.class);
	Map<String, String> otpMap = new HashMap<>();

	@RequestMapping(path = { "/{mobileNo}/AUTOGEN" }, method = RequestMethod.GET)
	@ApiOperation(value = "Send otp to user", notes = "would return a payload stating the transaction status")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful response"),
			@ApiResponse(code = 400, message = "Mobile no length is not 10"),
			@ApiResponse(code = 500, message = "Something went wrong!") })
	public ResponseEntity<UserRegistrationTempResource> sendOtp(
			@PathVariable("apiKey") String apiKey,
			@PathVariable("mobileNo") @NotNull String mobileNo
			) throws InterruptedException {

		UserRegistrationTempResource res = null;
		if (!apiKey.equals("122333")) {
			// invalid api key
			res = new UserRegistrationTempResource();
			res.status = "Error";
			res.details = "Invalid API Key";
			log.error("Invalid api key");
			return new ResponseEntity<UserRegistrationTempResource>(res, HttpStatus.OK);
		} else if (mobileNo.equals("7060010551")) {
			// successful case
			res = new UserRegistrationTempResource();
			res.status = "Success";
			res.details = RandomStringUtils.randomAlphanumeric(10);
			log.debug("successful");
			return new ResponseEntity<UserRegistrationTempResource>(res, HttpStatus.OK);
		} else if (mobileNo.equals("7060010552")) {
			// wron mobile no case
			res = new UserRegistrationTempResource();
			res.status = "Error";
			res.details = "Invalid Phone Number - Length Mismatch(Expected: 10)";
			log.debug("mobile no length is not 10");
			return new ResponseEntity<UserRegistrationTempResource>(res, HttpStatus.BAD_REQUEST);
		} else if (mobileNo.equals("7060010553")) {
			// delayed case
			res = new UserRegistrationTempResource();
			res.status = "success";
			res.details = RandomStringUtils.randomAlphanumeric(10);
			log.debug("thread is going to sleep for next 1 min");
			Thread.currentThread().sleep(1000 * 60);
			log.debug("thread wakesup again");
			return new ResponseEntity<UserRegistrationTempResource>(res, HttpStatus.OK);
		}
		log.debug("some other error occured");
		res = new UserRegistrationTempResource();
		res.status = "Error";
		res.details = "something went wrong";
		return new ResponseEntity<UserRegistrationTempResource>(res, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@RequestMapping(path = { "/VERIFY/{sessionId}/{otp}" }, method = RequestMethod.GET)
	@ApiOperation(value = "verify the otp against the session id", notes = "would return a payload stating the transaction status")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful response"),
			@ApiResponse(code = 400, message = "session id and otp combination is invalid"),
			@ApiResponse(code = 500, message = "Something went wrong!") })
	public ResponseEntity<UserRegistrationTempResource> verifyOtp(@PathVariable("apiKey") String apiKey,
			@PathVariable("otp") String otp, @PathVariable("sessionId") String sessionId) throws InterruptedException {

		UserRegistrationTempResource res = null;
		if (!apiKey.equals("122333")) {
			// invalid api key
			res = new UserRegistrationTempResource();
			res.status = "Error";
			res.details = "Invalid API Key";
			return new ResponseEntity<UserRegistrationTempResource>(res, HttpStatus.OK);
		} else if (otp.equals("1234")) {
			// successful case
			res = new UserRegistrationTempResource();
			res.status = "Success";
			res.details = "OTP Matched";
			return new ResponseEntity<UserRegistrationTempResource>(res, HttpStatus.OK);
		} else if (otp.equals("1235")) {
			// expired
			res = new UserRegistrationTempResource();
			res.status = "Success";
			res.details = "OTP Expired";
			return new ResponseEntity<UserRegistrationTempResource>(res, HttpStatus.OK);
		} else if (otp.equals("1236")) {
			// wrong otp
			res = new UserRegistrationTempResource();
			res.status = "Success";
			res.details = "OTP Not Matched";
			return new ResponseEntity<UserRegistrationTempResource>(res, HttpStatus.OK);
		} else if (otp.equals("1237")) {
			// delayed response
			res = new UserRegistrationTempResource();
			res.status = "Success";
			res.details = "OTP Matched";
			Thread.currentThread().sleep(1000 * 60);
			return new ResponseEntity<UserRegistrationTempResource>(res, HttpStatus.OK);
		} else if (otp.equals("1238")) {
			res = new UserRegistrationTempResource();
			res.status = "Error";
			res.details = "Invalid API / SessionId Combination - No Entry Exists";
			return new ResponseEntity<UserRegistrationTempResource>(res, HttpStatus.BAD_REQUEST);
		}
		res = new UserRegistrationTempResource();
		res.status = "Error";
		res.details = "something went wrong";
		return new ResponseEntity<UserRegistrationTempResource>(res, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
