<div class="form-group">
													<input type="text" name="user_id" class="form-style"
														placeholder="아이디" id="user_id" autocomplete="off">
												</div>
												<div class="form-group">
													<input type="password" name="user_password"
														class="form-style" placeholder="비밀번호" id="user_password"
														autocomplete="off">
												</div>
												<div class="form-group">
													<input type="text" name="user_name" class="form-style"
														placeholder="이름" id="user_name" autocomplete="off">
												</div>
												<div class="form-group">
													<input type="text" name="user_addr1" class="form-style"
														placeholder="주소" id="user_addr1" autocomplete="off">
												</div>

												<script>
													// input 요소를 찾습니다.
													var userInput = document
															.getElementById("user_addr1");

													// input 요소를 클릭했을 때 searchAddr() 함수를 호출하도록 이벤트 리스너를 추가합니다.
													userInput.addEventListener(
															"click",
															function() {
																searchAddr();
															});

													function searchAddr() {
														new daum.Postcode(
																{
																	oncomplete : function(
																			data) {
																		// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

																		// 각 주소의 노출 규칙에 따라 주소를 조합한다.
																		// 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
																		var addr = ''; // 주소 변수
																		var extraAddr = ''; // 참고항목 변수

																		// 사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
																		if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
																			addr = data.roadAddress;
																		} else { // 사용자가 지번 주소를 선택했을 경우(J)
																			addr = data.jibunAddress;
																		}

																		// 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
																		if (data.userSelectedType === 'R') {
																			// 법정동명이 있을 경우 추가한다. (법정리는 제외)
																			// 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
																			if (data.bname !== ''
																					&& /[동|로|가]$/g
																							.test(data.bname)) {
																				extraAddr += data.bname;
																			}
																			// 건물명이 있고, 공동주택일 경우 추가한다.
																			if (data.buildingName !== ''
																					&& data.apartment === 'Y') {
																				extraAddr += (extraAddr !== '' ? ', '
																						+ data.buildingName
																						: data.buildingName);
																			}
																			// 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
																			if (extraAddr !== '') {
																				extraAddr = ' ('
																						+ extraAddr
																						+ ')';
																			}
																			// 조합된 참고항목을 해당 필드에 넣는다.
																			document
																					.getElementById("extraAddr").value = extraAddr;

																		} else {
																			document
																					.getElementById("user_addr2").value = '';
																		}

																		// 우편번호와 주소 정보를 해당 필드에 넣는다.
																		document
																				.getElementById('user_postal').value = data.zonecode;
																		document
																				.getElementById("user_addr1").value = addr;
																		// 커서를 상세주소 필드로 이동한다.
																		document
																				.getElementById(
																						"user_addr2")
																				.focus();
																	}
																}).open();
														customInput.style.display = "none";
													}
												</script>

												<div class="form-group">
													<input type="text" name="user_addr2" class="form-style"
														placeholder="상세주소" id="user_addr2" autocomplete="off">
												</div>
												<div class="form-group">
													<input type="text" name="user_postal" class="form-style"
														placeholder="우편번호" id="user_postal" autocomplete="off">
												</div>
												<input type="hidden" id="extraAddr" placeholder="참고항목">
												<div class="form-group">
													<input type="text" name="user_residentno"
														class="form-style" placeholder="주민등록번호(-를 제외하고 적어주세요)"
														id="user_residentno" autocomplete="off">
												</div>
												<div class="form-group">
													<input type="text" name="user_phone" class="form-style"
														placeholder="전화번호(-를 제외하고 적어주세요)" id="user_phone" autocomplete="off">
												</div>