package com.wallacesintra.firstSpring

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/profile")
class UserProfileController {
    var user: UserDTO? = null

    @GetMapping
    fun getUserProfile(): UserDTO{
        return UserDTO(
            name = "Wallace Sintra",
            age = 25,
            email = "wallace@example.com"
        )
    }

    @PostMapping
    fun createUserProfile(
        @RequestBody user: UserDTO
    ): UserDTO{
        return user
    }
}